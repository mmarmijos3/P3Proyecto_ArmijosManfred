
package Model;

import Model.Builder.VesselConstructor;
import Model.Command.BillReceiver;
import Model.Command.OperationInvoker;
import Model.DataBase.DocumentManage;
import Model.DataBase.OperationsCRUD;
import Model.Entities.Vessel;

/**
 *
 * @author Manfred Armijos
 */
public class ModelDock {
    
    /*
    Docks the first vessel in the queue for service operations.
    Checks if queue is empty or dock is busy before proceeding.
    Updates the service panel with vessel details and enables operations.
    */
    
    private OperationsCRUD crud;
    private DocumentManage docManager;
    private VesselConstructor constructor;
    private Vessel vessel;
    private BillReceiver receiver = new BillReceiver();
    private OperationInvoker invoker = new OperationInvoker();

    private void setVesselInfo(Object[] info){
        this.vessel = constructor.contructFromDoc(info);
    }
    
    private Object[] takeFirstVesseInfo(){
        return docManager.docListToObjList(crud.read()).getFirst();
    }
    
    private void dockVessel(){
        if(takeFirstVesseInfo() != null){
            setVesselInfo(takeFirstVesseInfo());
        }
    }
    
    
    
}
