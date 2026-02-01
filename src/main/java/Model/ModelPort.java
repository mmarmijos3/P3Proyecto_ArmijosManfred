package Model;

import Model.Builder.VesselConstructor;
import Model.DataBase.CRUDVessel;
import Model.DataBase.DocumentManage;
import Model.DataBase.OperationsCRUD;
import Model.Entities.Vessel;
import java.util.List;
import org.bson.Document;

public class ModelPort {
    
    private OperationsCRUD crud = new CRUDVessel();
    private VesselConstructor constructor = new VesselConstructor();
    private DocumentManage docManager = new DocumentManage();
    

    private Document documentVessel(Vessel vessel){
        return docManager.documentVessel(vessel);
    }
    
    private Vessel createVessel(String type, String category, String name, String imo, int occupancy){
        return constructor.contructVessel(type, category, name, imo, occupancy);
    }
    
    public void addVesselInQueue(String type, String category, String name, String imo, int occupancy) {
        crud.create(documentVessel(createVessel(type, category, name, imo, occupancy)));
    }
    
    public void updateVesselInQueue(String type, String category, String name, String imo, int occupancy) {
        crud.update(imo, documentVessel(createVessel(type, category, name, imo, occupancy)));
    }
    
    public List<Object[]> getAllQueue(){
        return docManager.docListToObjList(crud.read());
    }
    
    public List<Object[]> searchVesselInQueue(String imo){
        return docManager.docListToObjList(crud.read());
    }
    
    public void deleteVesselInQueue(String imo){
        crud.delete(imo);
    }
    
    public void deleteQueue(){
        crud.deleteCollection();
    }
    
    public void deleteDatabase(){
        crud.deleteDatabase();
    }
    
}
