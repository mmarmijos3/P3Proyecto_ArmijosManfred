
package Controller;

import View.ViewMenu;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerMenu {
    private ViewMenu viewMenu;

    public ControllerMenu(ViewMenu viewMenu) {
        this.viewMenu = viewMenu;
        prepareButtons();
    }
    
    public void showViewMenu(){
        viewMenu.setVisible(true);
    }
    
    private void prepareButtons(){
        viewMenu.getBtnGoPort().addActionListener(e -> goToPort());
        viewMenu.getBtnGoDock().addActionListener(e -> goToDock());
        viewMenu.getBtnGoBills().addActionListener(e -> goToBills());
        viewMenu.getBtnGoLogin().addActionListener(e -> goToLogin());
    }
    
    private void goToPort(){
        viewMenu.setVisible(false);
        MainController.showPort();
    }
    
    private void goToDock(){
        viewMenu.setVisible(false);
        MainController.showDock();
    }
    
    private void goToBills(){
        viewMenu.setVisible(false);
        MainController.showBills();    
    }
    
    private void goToLogin(){
        viewMenu.setVisible(false);
        MainController.showLogin();
    }
    
    
    
}
