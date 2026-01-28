
package Controller;

import Model.ModelLogin;
import View.ViewLogin;

public class ControllerLogin {
    private ViewLogin viewLogin;
    private ModelLogin modelLogin;

    public ControllerLogin(ViewLogin viewLogin) {
        this.viewLogin = viewLogin;
        this.modelLogin = new ModelLogin();
        prepareButtons();
    }

    public void showViewLogin(){
        viewLogin.setVisible(true);
    }
    
    private void prepareButtons(){
        viewLogin.getBtnLogin().addActionListener(e -> login());
        viewLogin.getBtnExit().addActionListener(e -> exit());
    }
    
    
    
   
    private void login() {
        if (validateEmptyFields() && validCredentials()){
            viewLogin.clear();
            goToMenu();
        }
    }
    
    private void goToMenu(){
        viewLogin.setVisible(false);
        MainController.showMenu();
    }
    
    private boolean  validCredentials(){
        String errorMessage = modelLogin.validateLogin(
                viewLogin.getUsername(), 
                viewLogin.getPassword());
        
        if (errorMessage != null){
            viewLogin.showErrors(errorMessage);
            return false;
        }
        
        return true;
    }
    
    private boolean validateEmptyFields(){
        if(viewLogin.getUsername().isEmpty() || viewLogin.getPassword().isEmpty()){
            viewLogin.showErrors("Complete both fields");
            return false;
        }
        return true;
    }
    
    private void exit() {
        System.exit(0);
    }
}
