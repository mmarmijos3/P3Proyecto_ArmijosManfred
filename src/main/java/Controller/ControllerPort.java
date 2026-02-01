
package Controller;

import Model.ModelPort;
import View.ViewPort;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerPort {
    private ViewPort viewPort;
    private ModelPort modelPort;

    public ControllerPort(ViewPort viewPort) {
        this.viewPort = viewPort;
        this.modelPort = new ModelPort();
        prepareButtons();
    }

    public void showViewPort(){
        viewPort.setVisible(true);
    }
    
    private void prepareButtons(){
        viewPort.getBtnBack().addActionListener(e -> goToMenu());
        viewPort.getBtnCreate().addActionListener(e -> saveVessel());
    }

    private void goToMenu() {
        viewPort.setVisible(false);
        MainController.showMenu();
    }
    
    private void saveVessel(){
        isFormValid();
    }
    
    private boolean isFormValid(){
        return (
                validateFormName() & 
                validateFormIMO() &
                validateFormType() &
                validateFormCategory() &
                validateFormQuantity()
                );
    }

    private boolean validateFormName() {
        
        String error = Validation.validateNameForm(viewPort.getNameForm());
        
        if(error != null){
            viewPort.showlErrorName(error);
            return false;
        }
        
        viewPort.cleanlErrorName();
        return true;
    }
    
    private boolean validateFormIMO() {
        String error = Validation.validateImoForm(viewPort.getIMOForm());
        
        if(error != null){
            viewPort.showlErrorIMO(error);
            return false;
        }
        
        viewPort.cleanlErrorIMO();
        return true;
    }
    private boolean validateFormType() {
        if (viewPort.getTypeForm().equals("Select Type")){
            viewPort.showErrorType("Select one type");
            return false;
        }
        viewPort.cleanErrorType();
        return true;
    }
    
    
    private boolean validateFormCategory() {
        if (viewPort.getCategoryForm().equals("Select Category")){
            viewPort.showErrorCategory("Select one Category");
            return false;
        }
        viewPort.cleanErrorCategory();
        return true;
    }
    private boolean validateFormQuantity() {
        boolean succes = true;
        if (!validateFormType()){
            viewPort.showErrorOccupancy("Need type");
            succes = false;
        }
        if (!validateFormCategory()){
            viewPort.showErrorOccupancy("Need category");
            succes = false;
        }
        if (!validateFormType() & !validateFormCategory()){
            viewPort.showErrorOccupancy("Need type and category");
            succes = false;
        }
        if (succes) viewPort.cleanErrorOccupancy();
        return succes;
    }
    
    
    
    
}
