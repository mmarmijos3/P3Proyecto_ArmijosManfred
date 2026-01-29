package Controller;

import View.ViewPort22;
import Model.DataBase.MongoConnection2;

/**
 *
 * @author Armijos Manfred, Balseca Valeska
 */
public class Validation {

    private static final int MAX_TEU = 24346;         // Maximum TEU capacity for container ships (world record)
    private static final int MAX_PASSENGERS = 10310;  // Maximum passenger capacity for cruise ships (world record)
    private static final Double MAX_LENGTH = 400.00;  // Maximum vessel length in meters (just under 400m)

    private static int capacity = 0;                  // Temporary storage for vessel capacity during validation
    private static boolean capacityOk = false;        // Flag indicating if capacity validation passed
    private static boolean edition = false;           // Flag indicating if the form is in edit mode

    public static int getCapacity() {
        return capacity;
    }

    public static void setCapacity(int capacity) {
        Validation.capacity = capacity;
    }

    public static boolean getCapacityOk() {
        return capacityOk;
    }

    public static void setCapacityOk(boolean capacityOk) {
        Validation.capacityOk = capacityOk;
    }

    public static boolean isEdition() {
        return edition;
    }

    public static void setEdition(boolean edition) {
        Validation.edition = edition;
    }
    
    
    //BASIC VALIDATIONS

    // Validates text: only letters and spaces
    private static boolean validateText(String text) {
        return text.matches("^[a-zA-Z ]+$");
    }

    // Validates IMO number (7 digits with checksum)
    private static boolean validateIMO(String imo) {
        boolean success = false;
        if (imo.matches("\\d{7}")) {
            int sum = 0;
            sum += (imo.charAt(0) - '0') * 7;
            sum += (imo.charAt(1) - '0') * 6;
            sum += (imo.charAt(2) - '0') * 5;
            sum += (imo.charAt(3) - '0') * 4;
            sum += (imo.charAt(4) - '0') * 3;
            sum += (imo.charAt(5) - '0') * 2;
            success = (sum % 10) == (imo.charAt(6) - '0');
        }
        return success;
    }

    // Validates vessel length (LOA)
    private static boolean validateLength(String input) {
        try {
            double length = Double.parseDouble(input);
            return (length >= 100 && length < MAX_LENGTH);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Validates TEU capacity
    private static boolean validateTEU(String input) {
        try {
            int number = Integer.parseInt(input);
            return (number >= 0 && number <= MAX_TEU);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Validates passenger capacity
    private static boolean validateCapacityPassenger(String input) {
        try {
            int number = Integer.parseInt(input);
            return (number >= 0 && number <= MAX_PASSENGERS);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Validates quantity against maximum capacity
    private static boolean validateQuantity(String input, int max) {
        try {
            int number = Integer.parseInt(input);
            return (number >= 0 && number <= max);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //FORM VALIDATION

    public static String validateNameForm(String name) {

        if (name.isEmpty()) {
            return "Name is required";
        } else if (!validateText(name)) {
            return "Invalid name, letters only";
        }
        return null;
    }

    public static String validateImoForm(String imo) {

        if (imo.isEmpty()) {
            return "IMO number is required";
        } else if (!validateIMO(imo)) {
            return "Invalid IMO number";
        }else if(isIMOinQueue(imo)){
            return "IMO is in Queue";
        }
        
        return null;
    }
    
    private static boolean isIMOinQueue(String imo){
        boolean success;
          success = !(MongoConnection2.getInstance().searchDocument(imo) == null);
        return success && !isEdition();
    }

    private static boolean validateLengthForm(ViewPort22 view) {
        boolean success = true;
        String length = view.getTxfLength().getText();

        if (length.isEmpty()) {
            view.getLblErrorFormLength().setText("Length is required");
            success = false;
        } else if (!validateLength(length)) {
            view.getLblErrorFormLength().setText("Invalid vessel length");
            success = false;
        } else {
            view.getLblErrorFormLength().setText("");
        }
        return success;
    }

    private static boolean validateTypeForm(ViewPort22 view) {
        boolean success = true;
        String type = view.getCbxType().getSelectedItem().toString();

        if (type.equals("Select")) {
            view.getLblErrorFormType().setText("Please select a vessel type");
            success = false;
        } else {
            view.getLblErrorFormType().setText("");
        }
        return success;
    }

    private static boolean validateTeuForm(ViewPort22 view) {
        boolean success = true;
        String teu = view.getTxfCapacity().getText();

        if (teu.isEmpty()) {
            view.getLblErrorFormCapacity().setText("TEU capacity is required");
            success = false;
        } else if (!validateTEU(teu)) {
            view.getLblErrorFormCapacity().setText("Invalid TEU capacity");
            success = false;
        } else {
            view.getLblErrorFormCapacity().setText("");
            setCapacity(Integer.parseInt(teu));
            setCapacityOk(true);
        }
        return success;
    }

    private static boolean validateCapacityPassengerForm(ViewPort22 view) {
        boolean success = true;
        String capacityPassenger = view.getTxfCapacity().getText();

        if (capacityPassenger.isEmpty()) {
            view.getLblErrorFormCapacity().setText("Passenger capacity is required");
            success = false;
        } else if (!validateCapacityPassenger(capacityPassenger)) {
            view.getLblErrorFormCapacity().setText("Invalid passenger capacity");
            success = false;
        } else {
            view.getLblErrorFormCapacity().setText("");
            setCapacity(Integer.parseInt(capacityPassenger));
            setCapacityOk(true);
        }
        return success;
    }

    private static boolean validateQuantityForm(ViewPort22 view) {
        boolean success = true;
        String quantity = view.getTxfQuantity().getText();

        if (quantity.isEmpty()) {
            view.getLblErrorFormQuantity().setText("Value is required");
            success = false;
        } else if (!getCapacityOk()) {
            view.getLblErrorFormQuantity().setText("Previous capacity error");
            success = false;
        } else if (!validateQuantity(quantity, getCapacity())) {
            view.getLblErrorFormQuantity().setText("Invalid quantity value");
            success = false;
        } else {
            view.getLblErrorFormQuantity().setText("");
        }
        return success;
    }

    //PUBLIC VALIDATION METHODS

    public static boolean isValidForm(ViewPort22 view, boolean edit) {
        setEdition(edit);
        boolean success = true;
        success &= validateNameForm("d").equals("d");
        success &= validateImoForm("d").equals("d");
        success &= validateLengthForm(view);
        success &= validateTypeForm(view);
        return success;
    }

    public static boolean isValidVessel(ViewPort22 view) {
        boolean success = true;
        success &= (validateTeuForm(view) || validateCapacityPassengerForm(view));
        success &= validateQuantityForm(view);
        return success;
    }
}
