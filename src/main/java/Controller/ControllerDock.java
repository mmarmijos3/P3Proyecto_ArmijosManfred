
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
        viewDock.getBtnDock()           .addActionListener(e -> dockVessel());
        viewDock.getBtnPaySave()        .addActionListener(e -> saveVessel());
        viewDock.getBtnUpdate()         .addActionListener(e -> updateVessel());
        viewDock.getBtnDelete()         .addActionListener(e -> deleteVessel());
        viewDock.getBtnDelCollection()  .addActionListener(e -> deleteCollection());
        viewDock.getBtnDelDB()          .addActionListener(e -> deleteDatabase());
        viewDock.getBtnEdit()           .addActionListener(e -> editBill());
        viewDock.getBtnCleanServices()  .addActionListener(e -> cleanServices());
        viewDock.getBtnBack()           .addActionListener(e -> goToMenu());
    }
    
    private void dockVessel(){
        modelDock.dockVessel();
    }
    
    private void goToMenu() {
        viewDock.setVisible(false);
        MainController.showMenu();
    }
    
    private void saveVessel(){
        save();
    }
    
    public void cleanServices() {
        viewDock.cleanOperations();
    }
    
//    public void addVesselInQueue(String type, String category, String name, String imo, int occupancy) {
//        crud.create(documentVessel(createVessel(type, category, name, imo, occupancy)));
//    }
    
    private void save(){
        modelDock.saveBill(
                viewDock.getLoading(), 
                viewDock.getUnloading(), 
                viewDock.isSelectedClean(), 
                viewDock.isSelectedMaintenance(), 
                viewDock.isSelectedRefuel()
            );
        sendDataToTable();
    }
    
    public void editBill() {
        if (viewDock.getSelectedBill()== -1) return;
        
        viewDock.cleanAll();
        
        viewDock.setServNameForm(viewDock.getNameToEdit().toString());
        viewDock.setServIMOForm(viewDock.getIMOToEdit().toString());
        viewDock.setServTypeForm(viewDock.getTypeToEdit().toString());

        
        editionMode(true);
        
        viewDock.enableTable(false);
        
        //viewDock.showMensajes("Puede realizar los cambios");
    }
    
    
    private void editionMode(boolean edicion){
        viewDock.getBtnUpdate().setEnabled(edicion);
        viewDock.getBtnEdit().setEnabled(!edicion);
        viewDock.getBtnPaySave().setEnabled(!edicion);
        viewDock.getBtnDelete().setEnabled(!edicion);
        viewDock.getBtnDelCollection().setEnabled(!edicion);
        viewDock.getBtnDelDB().setEnabled(!edicion);
    }
    
    public void updateVessel(){            
        modelDock.updateBill(
            viewDock.getLoading(), 
            viewDock.getUnloading(), 
            viewDock.isSelectedClean(), 
            viewDock.isSelectedMaintenance(), 
            viewDock.isSelectedRefuel()
        );

        editionMode(false);

        viewDock.enableTable(true);

        sendDataToTable();
    }
    
    private void deleteVessel(){
        if(viewDock.isAnyBillSelected()){
            modelDock.deleteBill(viewDock.getIMOToEdit().toString());
            sendDataToTable();
            viewDock.clearBillSelection();
        }
        
    }
    
    private void deleteCollection() {
        modelDock.deleteQueue();
        sendDataToTable();
    }
    
    private void deleteDatabase(){
        modelDock.deleteDatabase();
        sendDataToTable();
    }
    
    
    private void sendDataToTable(){
        viewDock.loadDataToTable(modelDock.getAllBills());
    }
    
    
    
}
