
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
    
    private boolean validateField(){
        return !viewLogin.getUser().isBlank() && !viewLogin.getPassword().isBlank();
    }
   
    private void login() {
        if (validateField() && validCredentials()){
            goToMenu();
        }else{
            viewLogin.showErrorLogin();
        }
    }
    
    private void goToMenu(){
        viewLogin.setVisible(false);
        MainController.showMenu();
    }
    
    private boolean  validCredentials(){
        return modelLogin.validateCredentials(
            viewLogin.getUser(), 
            viewLogin.getPassword()
        );
    }
    
    private void exit() {
        System.exit(0);
    }
}
