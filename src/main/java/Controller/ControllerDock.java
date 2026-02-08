
package Controller;

import Model.FacadeDock;
import View.ViewDock;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerDock {
    private ViewDock viewDock;
    private FacadeDock modelDock;

    public ControllerDock(ViewDock viewDock) {
        this.viewDock = viewDock;
        this.modelDock = new FacadeDock();
        prepareButtons();
    }

    public void showViewDock(){
        viewDock.setVisible(true);
        sendDataToTable();
    }
    
    private void prepareButtons(){
        viewDock.getBtnDock()           .addActionListener(e -> dockVessel());
        viewDock.getBtnPaySave()        .addActionListener(e -> saveVessel());
        viewDock.getBtnCalculate()      .addActionListener(e -> calculateBill());
        viewDock.getBtnDelete()         .addActionListener(e -> deleteVessel());
        viewDock.getBtnDelCollection()  .addActionListener(e -> deleteCollection());
        viewDock.getBtnDelDB()          .addActionListener(e -> deleteDatabase());
        viewDock.getBtnCleanServices()  .addActionListener(e -> cleanServices());
        viewDock.getBtnBack()           .addActionListener(e -> goToMenu());
    }
    
    private void dockVessel(){
        try {
            showDockInfo();
            modelDock.dockVessel();
            viewDock.getBtnPaySave().setEnabled(true);
        } catch (Exception e) {
            System.out.println("Empty Queue");
        }
        
    }
    
    private void showDockInfo(){
        Object[] info = modelDock.takeFirstVesseInfo();
        viewDock.setServNameForm(info[0].toString());
        viewDock.setServIMOForm(info[1].toString());
        viewDock.setServTypeForm(info[2].toString());
    }
    
    private void goToMenu() {
        viewDock.setVisible(false);
        MainController.showMenu();
    }
    
    private void saveVessel(){
        save();
    }
    
    public void cleanServices() {
        viewDock.cleanServices();
        viewDock.getBtnPaySave().setEnabled(false);
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
        modelDock.resetBill();
        viewDock.cleanAll();
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
        viewDock.getBtnCalculate().setEnabled(edicion);
        viewDock.getBtnEdit().setEnabled(!edicion);
        viewDock.getBtnPaySave().setEnabled(!edicion);
        viewDock.getBtnDelete().setEnabled(!edicion);
        viewDock.getBtnDelCollection().setEnabled(!edicion);
        viewDock.getBtnDelDB().setEnabled(!edicion);
    }
    
    public void calculateBill(){
        
    }
    
    public void updateVessel(){            
        modelDock.updateBill(
            viewDock.getIDToEdit(),
            viewDock.getLoading(), 
            viewDock.getUnloading(), 
            viewDock.isSelectedClean(), 
            viewDock.isSelectedMaintenance(), 
            viewDock.isSelectedRefuel()
        );

        editionMode(false);

        viewDock.enableTable(true);

        sendDataToTable();
        
        modelDock.resetBill();
        
        viewDock.cleanAll();
    }
    
    private void deleteVessel(){
        if(viewDock.isAnyBillSelected()){
            modelDock.deleteBill(viewDock.getIDToEdit());
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
