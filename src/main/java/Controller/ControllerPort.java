
package Controller;

import Model.FacadelPort;
import View.ViewPort;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerPort {
    private ViewPort viewPort;
    private FacadelPort modelPort;

    public ControllerPort(ViewPort viewPort) {
        this.viewPort = viewPort;
        this.modelPort = new FacadelPort();
        prepareButtons();
    }

    public void showViewPort(){
        viewPort.setVisible(true);
        sendDataToTable();
    }
    
    private void prepareButtons(){
        viewPort.getBtnCreate()         .addActionListener(e -> saveVessel());
        viewPort.getBtnUpdate()         .addActionListener(e -> updateVessel());
        viewPort.getBtnDelete()         .addActionListener(e -> deleteVessel());
        viewPort.getBtnDelCollection()  .addActionListener(e -> deleteCollection());
        viewPort.getBtnDelDB()          .addActionListener(e -> deleteDatabase());
        viewPort.getBtnEdit()           .addActionListener(e -> editVessel());
        viewPort.getBtnCleanForm()      .addActionListener(e -> cleanForm());
        viewPort.getBtnSearch()         .addActionListener(e -> searchVessel());
        viewPort.getBtnCleanSearch()    .addActionListener(e -> cleanSearch());
        viewPort.getBtnBack()           .addActionListener(e -> goToMenu());
    }

    private void goToMenu() {
        viewPort.setVisible(false);
        MainController.showMenu();
    }
    
    private void saveVessel(){
        if(isFormValid()){
            save();
        }
    }
    
    public void cleanForm() {
        viewPort.cleanForm();
    }
    
//    public void addVesselInQueue(String type, String category, String name, String imo, int occupancy) {
//        crud.create(documentVessel(createVessel(type, category, name, imo, occupancy)));
//    }
    
    private void save(){
        if(isFormValid())
            modelPort.addVesselInQueue(
                viewPort.getTypeForm(),
                viewPort.getCategoryForm(),
                viewPort.getNameForm(),
                viewPort.getIMOForm(),
                viewPort.getOccupancyForm()
            );
        sendDataToTable();
    }
    
    public void editVessel() {
        if (viewPort.getSelectedVessel()== -1) return;
        
        cleanForm();
        
        viewPort.setNameForm(viewPort.getNameToEdit().toString());
        viewPort.setIMOForm(viewPort.getIMOToEdit().toString());
        viewPort.setTypeForm(viewPort.getTypeToEdit());
        viewPort.setCategoryForm(viewPort.getCategoryToEdit());
        viewPort.setOccupancyForm((int)viewPort.getOccupancyToEdit());
        
        editionMode(true);
        
        viewPort.enableTable(false);
        
        //viewPort.showMensajes("Puede realizar los cambios");
    }
    
    
    private void editionMode(boolean edicion){
        viewPort.getBtnUpdate().setEnabled(edicion);
        viewPort.getBtnEdit().setEnabled(!edicion);
        viewPort.getBtnCreate().setEnabled(!edicion);
        viewPort.getBtnDelete().setEnabled(!edicion);
        viewPort.getBtnDelCollection().setEnabled(!edicion);
        viewPort.getBtnDelDB().setEnabled(!edicion);
        viewPort.getBtnSearch().setEnabled(!edicion);
        viewPort.getBtnCleanSearch().setEnabled(!edicion);
    }
    
    public void updateVessel(){
        if(isFormValid()){
            
            modelPort.updateVesselInQueue(
                viewPort.getIMOToEdit().toString(),
                viewPort.getTypeForm(),
                viewPort.getCategoryForm(),
                viewPort.getNameForm(),
                viewPort.getIMOForm(),
                viewPort.getOccupancyForm()
            );

            editionMode(false);
            
            viewPort.enableTable(true);
            
            sendDataToTable();
            //viewPort.showMensajes("Datos actualizados");
        }
    }
    
    private void deleteVessel(){
        if(viewPort.isAnyVesselSelected()){
            modelPort.deleteVesselInQueue(viewPort.getIMOToEdit().toString());
            sendDataToTable();
            viewPort.clearVesselSelection();
        }
        
    }
    
    private void deleteCollection() {
        modelPort.deleteQueue();
        sendDataToTable();
    }
    
    private void deleteDatabase(){
        modelPort.deleteDatabase();
        sendDataToTable();
    }
    
    public void searchVessel(){
        if(validSearch())
            sendFindToTable();
    }
    
    private void cleanSearch() {
        viewPort.cleanErrorSearch();
        viewPort.cleanIMOToSearch();
        sendDataToTable();
    }
    
    private void sendDataToTable(){
        viewPort.loadDataToTable(modelPort.getAllQueue());
    }
    
    private void sendFindToTable(){
        viewPort.loadDataToTable(modelPort.searchVesselInQueue(viewPort.getIMOToSearch()));
    }
    
    
    private boolean isFormValid(){
        return (
                validateFormName() & 
                validateFormIMO() &
                validateFormType() &
                validateFormCategory() &
                validateFormQuantity()
                );
    }

    private boolean validateFormName() {
        
        String error = Validation.validateNameForm(viewPort.getNameForm());
        
        if(error != null){
            viewPort.showlErrorName(error);
            return false;
        }
        
        viewPort.cleanlErrorName();
        return true;
    }
    
    private boolean isIMOInQueue(String imo){
        return !modelPort.searchVesselInQueue(imo).isEmpty();
    }
    
    private boolean isIMOChange(){
        if(viewPort.getSelectedVessel() == -1){
            return true;
        }
        return !viewPort.getIMOForm().equals(viewPort.getIMOToEdit().toString());
    }
    
    private boolean validateFormIMO() {
        String error = Validation.validateImoForm(viewPort.getIMOForm());
        
        if(error != null){
            viewPort.showlErrorIMO(error);
            return false;
        }
        if(isIMOChange() && isIMOInQueue(viewPort.getIMOForm())){
            viewPort.showlErrorIMO("IMO is in queue");
            return false;
        }
        
        viewPort.cleanlErrorIMO();
        return true;
    }
    private boolean validateFormType() {
        if (viewPort.getTypeForm().equals("Select Type")){
            viewPort.showErrorType("Select one type");
            return false;
        }
        viewPort.cleanErrorType();
        return true;
    }
    
    
    private boolean validateFormCategory() {
        if (viewPort.getCategoryForm().equals("Select Category")){
            viewPort.showErrorCategory("Select one Category");
            return false;
        }
        viewPort.cleanErrorCategory();
        return true;
    }
    private boolean validateFormQuantity() {
        boolean succes = true;
        if (!validateFormType()){
            viewPort.showErrorOccupancy("Need type");
            succes = false;
        }
        if (!validateFormCategory()){
            viewPort.showErrorOccupancy("Need category");
            succes = false;
        }
        if (!validateFormType() & !validateFormCategory()){
            viewPort.showErrorOccupancy("Need type and category");
            succes = false;
        }
        if (succes) viewPort.cleanErrorOccupancy();
        return succes;
    }
    
    private boolean validSearch(){
        if(viewPort.getIMOToSearch().isEmpty()){
            viewPort.showErrorSearch("Input an IMO");
            return false;
        }
        if(!isIMOInQueue(viewPort.getIMOToSearch())){
            viewPort.showErrorSearch("Vessel not found");
            return false;
        }
        return true;
    }
    
    
}
