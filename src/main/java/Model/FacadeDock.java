
package Model;

import Model.Builder.VesselConstructor;
import Model.Command.BillReceiver;
import Model.Command.*;
import Model.Command.OperationInvoker;
import Model.DataBase.DocumentManage;
import Model.DataBase.MongoCRUD;
import Model.DataBase.OperationsCRUD;
import Model.Entities.Vessel;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Manfred Armijos
 */
public class FacadeDock {
       
    private OperationsCRUD crud;
    private DocumentManage docManager;
    private VesselConstructor constructor;
    private Vessel vessel;
    private BillReceiver receiver;
    private OperationInvoker invoker;

    public FacadeDock() {
        this.crud = new MongoCRUD("Bills");
        this.docManager = new DocumentManage();
        this.constructor = new VesselConstructor();
        this.vessel = null;
        this.receiver = new BillReceiver();
        this.invoker = new OperationInvoker();
    }
    
    
    
    
    private Document documentBill(){
        return docManager.documentBill(generateCompleteBill());
    }
    
    
    public void saveBill(boolean l,boolean u,boolean c,boolean m,boolean r) {
        onCommands(l, u, c, m, r);
        crud.create(documentBill());
    }
    
    public void updateBill(Object id, boolean l,boolean u,boolean c,boolean m,boolean r) {
        onCommands(l, u, c, m, r);
        crud.update("_id",id, documentBill());
    }
    
    public List<Object[]> getAllBills(){
        return docManager.listToBills(crud.read());
    }
    
    public List<Object[]> searchBill(String imo){
        return docManager.listToBills(crud.find("_id",imo));
    }
    
    public void deleteBill(Object id){
        crud.delete("_id",id);
    }
    
    public void deleteQueue(){
        crud.deleteCollection();
    }
    
    public void deleteDatabase(){
        crud.deleteDatabase();
    }
    
    private void setVesselInfo(Object[] info){
        this.vessel = constructor.contructFromDoc(info);
        
    }
    
    public Object[] takeFirstVesseInfo(){
        crud.setCollection("VesselQueue");
        try {
            return docManager.docToVesselInfo(crud.read().getFirst());
        } catch (Exception e) {
            return null;
        }
        finally{
            crud.setCollection("Bills");
        }
        
    }
    
    public void dockVessel(){
        if(takeFirstVesseInfo() != null){
            setVesselInfo(takeFirstVesseInfo());
            new FacadelPort().deleteVesselInQueue(vessel.getImo());
        }
    }
    
    
    private void onCommands(boolean l,boolean u,boolean c,boolean m,boolean r){
        dockFeeVessel();
        loadVessel(l);
        unloadcleanVessel(u);
        cleanVessel(c);
        maintenanceVessel(m);
        refuelVessel(r);
        invoker.executeCommands();
    }
    
    private void dockFeeVessel(){
        invoker.addCommand(new DockCommand(receiver, vessel));
    }
    
    private void loadVessel(boolean load){
        invoker.addCommand(new LoadingCommand(receiver, vessel, load));
    }
    
    private void unloadcleanVessel(boolean unload){
        invoker.addCommand(new UnloadingCommand(receiver, vessel, unload));
    }
    
    private void cleanVessel(boolean clean){
        invoker.addCommand(new CleanCommand(receiver, vessel, clean));
    }
    
    private void maintenanceVessel(boolean maintenance){
        invoker.addCommand(new MaintenanceCommand(receiver, vessel, maintenance));
    }
    
    private void refuelVessel(boolean refuel){
        invoker.addCommand(new RefuelCommand(receiver, vessel, refuel));
    }
    
    private Object[] generateBill(){
        return receiver.getBill();
    }
    
    private Object[] generateCompleteBill(){
        Object[] fullBill = new Object[4];
        fullBill[0] = vessel.getImo();
        fullBill[1] = vessel.getName();
        fullBill[2] = vessel.getType();
        fullBill[3] = generateBill()[3];
        
        return fullBill;
    }
    
    public void resetBill(){
        receiver.reset();
    }
    
}
