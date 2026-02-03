
package Model;

import Model.Builder.VesselConstructor;
import Model.Command.BillReceiver;
import Model.Command.*;
import Model.Command.OperationInvoker;
import Model.DataBase.CRUDBills;
import Model.DataBase.CRUDVessel;
import Model.DataBase.DocumentManage;
import Model.DataBase.OperationsCRUD;
import Model.Entities.Vessel;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Manfred Armijos
 */
public class ModelDock {
       
    private OperationsCRUD crud;
    private DocumentManage docManager;
    private VesselConstructor constructor;
    private Vessel vessel;
    private BillReceiver receiver;
    private OperationInvoker invoker;

    public ModelDock() {
        this.crud = new CRUDBills();
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
    
    public void updateBill(boolean l,boolean u,boolean c,boolean m,boolean r) {
        onCommands(l, u, c, m, r);
        crud.update(vessel.getImo(), documentBill());
    }
    
    public List<Object[]> getAllBills(){
        return docManager.docListToObjList(crud.read());
    }
    
    public List<Object[]> searchBill(String imo){
        return docManager.docListToObjList(crud.find(imo));
    }
    
    public void deleteBill(String imo){
        crud.delete(imo);
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
    
    private Object[] takeFirstVesseInfo(){
        return docManager.docListToObjList(new CRUDVessel().read()).getFirst();
    }
    
    public void dockVessel(){
        if(takeFirstVesseInfo() != null){
            setVesselInfo(takeFirstVesseInfo());
        }
    }
    
    
    private void onCommands(boolean l,boolean u,boolean c,boolean m,boolean r){
        loadVessel(l);
        unloadcleanVessel(u);
        cleanVessel(c);
        maintenanceVessel(m);
        refuelVessel(r);
        invoker.executeCommands();
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
    

    
    
    
    
    
}
