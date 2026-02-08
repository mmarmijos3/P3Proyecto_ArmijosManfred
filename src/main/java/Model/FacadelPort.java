package Model;

import Model.Builder.VesselConstructor;
import Model.DataBase.DocumentManage;
import Model.DataBase.MongoCRUD;
import Model.DataBase.OperationsCRUD;
import Model.Entities.Vessel;
import java.util.List;
import org.bson.Document;

public class FacadelPort {
    
    private OperationsCRUD crud;
    private VesselConstructor constructor;
    private DocumentManage docManager;

    public FacadelPort() {
        this.crud = new MongoCRUD("VesselQueue");
        this.constructor = new VesselConstructor();
        this.docManager = new DocumentManage();
    }


    private Document documentVessel(Vessel vessel){
        return docManager.documentVessel(vessel);
    }
    
    private Vessel createVessel(String type, String category, String name, String imo, int occupancy){
        return constructor.contructVessel(type, category, name, imo, occupancy);
    }
    
    public void addVesselInQueue(String type, String category, String name, String imo, int occupancy) {
        crud.create(documentVessel(createVessel(type, category, name, imo, occupancy)));
    }
    
    public void updateVesselInQueue(String imoEdit, String type, String category, String name, String imo, int occupancy) {
        crud.update("imo",imoEdit, documentVessel(createVessel(type, category, name, imo, occupancy)));
    }
    
    public List<Object[]> getAllQueue(){
        return docManager.listToVessels(crud.read());
    }
    
    public List<Object[]> searchVesselInQueue(String imo){
        return docManager.listToVessels(crud.find("imo",imo));
    }
    
    public void deleteVesselInQueue(String imo){
        crud.delete("imo",imo);
    }
    
    public void deleteQueue(){
        crud.deleteCollection();
    }
    
    public void deleteDatabase(){
        crud.deleteDatabase();
    }
    
}
