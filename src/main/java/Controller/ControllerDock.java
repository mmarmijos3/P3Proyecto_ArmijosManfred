
package Controller;

import Model.ModelDock;
import View.ViewDock;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerDock {
    private ViewDock viewDock;
    private ModelDock modelDock;

    public ControllerDock(ViewDock viewDock) {
        this.viewDock = viewDock;
        this.modelDock = new ModelDock();
        prepareButtons();
    }

    public void showViewDock(){
        viewDock.setVisible(true);
    }
    
    private void prepareButtons(){
        
    }
}
