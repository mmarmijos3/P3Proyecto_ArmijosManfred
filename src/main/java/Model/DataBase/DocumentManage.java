package Model.DataBase;

import Model.Entities.Vessel;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class DocumentManage {
    
    public Document documentVessel(Vessel  vessel){
        Document doc = new Document();
        
        doc.append("imo", vessel.getImo());
        doc.append("name", vessel.getName());
        doc.append("type", vessel.getType());
        doc.append("category", vessel.getCategory());
        doc.append("length", vessel.getLength());
        doc.append("beam", vessel.getBeam());
        doc.append("draft", vessel.getDraft());
        doc.append("capacity", vessel.getCapacity());
        doc.append("quantity", vessel.getQuantity());
        
        return doc;
    }
    
//    public static Document documentCruiseShip(CruiseShip cruiseShip){
//        Document doc = new Document();
//        
//        doc.append("imo", cruiseShip.getImo());
//        doc.append("name", cruiseShip.getName());
//        doc.append("type", cruiseShip.getType());
//        doc.append("length", cruiseShip.getLength());
//        doc.append("beam", cruiseShip.getBeam());
//        doc.append("draft", cruiseShip.getDraft());
//        doc.append("capacity", cruiseShip.getPassengerCapacity());
//        doc.append("quantity", cruiseShip.getPassengers());
//        
//        return doc;
//    }
//    
//    public static Document documentContainerShip(ContainerShip containerShip){
//        Document doc = new Document();
//        
//        doc.append("imo", containerShip.getImo());
//        doc.append("name", containerShip.getName());
//        doc.append("type", containerShip.getType());
//        doc.append("length", containerShip.getLength());
//        doc.append("beam", containerShip.getBeam());
//        doc.append("draft", containerShip.getDraft());
//        doc.append("capacity", containerShip.getCapacityTEU());
//        doc.append("quantity", containerShip.getContainer());
//        
//        return doc;
//    }
    
    
    private Object[] docToArrayObj(Document doc){
        Object[] dato = new Object[9];

        dato[0] = doc.getString("imo");
        dato[1] = doc.getString("name");
        dato[2] = doc.getString("type");
        dato[3] = doc.getString("category");
//        dato[4] = doc.getDouble("length");
//        dato[5] = doc.getDouble("beam");
//        dato[6] = doc.getDouble("draft");
//        dato[7] = doc.getInteger("capacity");
        dato[4] = doc.getInteger("quantity");

        return dato;
    }
    
    public List<Object[]> docListToObjList(List<Document> documentos){
        List<Object[]> datos = new ArrayList<>();
        
        for (Document doc : documentos){
            datos.add(docToArrayObj(doc));
        }
        
        return datos;
    }
}
