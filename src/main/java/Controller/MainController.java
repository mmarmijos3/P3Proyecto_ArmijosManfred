
package Controller;

import View.*;

/**
 *
 * @author Manfred Armijos
 */
public class MainController {
    private static ViewLogin viewLogin;
    private static ViewMenu  viewMenu;
    private static ViewPort  viewPort;
    private static ViewDock  viewDock;
    private static ViewBills viewBills;
    
    public static void showLogin(){
        if (viewLogin == null){
            viewLogin = new ViewLogin();
            new ControllerLogin(viewLogin).showViewLogin();
        }
        viewLogin.setVisible(true);
    }
    
    public static void showMenu(){
        if (viewMenu == null){
            viewMenu = new ViewMenu();
            new ControllerMenu(viewMenu).showViewMenu();
        }
        viewMenu.setVisible(true);
    }
    
    public static void showPort(){
        if (viewPort == null){
            viewPort = new ViewPort();
            new ControllerPort(viewPort).showViewPort();
        }
        viewPort.setVisible(true);
    }
    
    public static void showDock(){
        if (viewDock == null){
            viewDock = new ViewDock();
            new ControllerDock(viewDock).showViewDock();
        }
        viewDock.setVisible(true);
    }
    
    public static void showBills(){
        if (viewBills == null){
            viewBills = new ViewBills();
            new ControllerBills(viewBills).showViewBills();
        }
        viewBills.setVisible(true);
    }
    
    
}
