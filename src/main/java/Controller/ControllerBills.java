
package Controller;

import Model.ModelBills;
import View.ViewBills;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerBills {
    private ViewBills viewBills;
    private ModelBills modelBills;

    public ControllerBills(ViewBills viewBills) {
        this.viewBills = viewBills;
        this.modelBills = new ModelBills();
        prepareButtons();
    }

    public void showViewBills(){
        viewBills.setVisible(true);
    }
    
    private void prepareButtons(){
        viewBills.getBtnGoMenu().addActionListener(e -> goToMenu());
    }
    
    private void goToMenu() {
        viewBills.setVisible(false);
        MainController.showMenu();
    }
}
