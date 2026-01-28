
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
        viewPort.getBtnGoMenu().addActionListener(e -> goToMenu());
    }

    private void goToMenu() {
        viewPort.setVisible(false);
        MainController.showMenu();
    }
    
    private boolean isFormValid(){
        return (
                validateFormName() && 
                validateFormIMO() &&
                validateFormType() &&
                validateFormCategory() &&
                validateFormQuantity()
                );
    }

    private boolean validateFormName() {
        boolean success = true;
        if(viewPort.getNameForm().isEmpty()){
            viewPort.showlErrorName("empty");
            success = false;
        }
        
        
        return success;
    }
    private boolean validateFormIMO() {
        boolean success = true;
        return success;
    }
    private boolean validateFormType() {
        boolean success = true;
        return success;
    }
    private boolean validateFormCategory() {
        boolean success = true;
        return success;
    }
    private boolean validateFormQuantity() {
        boolean success = true;
        return success;
    }
    
    
    
    
}
