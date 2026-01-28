
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
    
    
    
}
