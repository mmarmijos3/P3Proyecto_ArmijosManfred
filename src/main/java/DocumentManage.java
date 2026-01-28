

import Model.Entities.ContainerShip;
import Model.Entities.CruiseShip;
import java.util.ArrayList;
import org.bson.Document;

public class DocumentManage {
    
    public Document documentCruiseShip(CruiseShip cruiseShip){
        Document doc = new Document();
        
        doc.append("imo", cruiseShip.getImo());
        doc.append("name", cruiseShip.getName());
        doc.append("type", cruiseShip.getType());
        doc.append("length", cruiseShip.getLength());
        doc.append("beam", cruiseShip.getBeam());
        doc.append("draft", cruiseShip.getDraft());
        doc.append("capacity", cruiseShip.getPassengerCapacity());
        doc.append("quantity", cruiseShip.getPassengers());
        
        return doc;
    }
    
    public Document documentContainerShip(ContainerShip containerShip){
        Document doc = new Document();
        
        doc.append("imo", containerShip.getImo());
        doc.append("name", containerShip.getName());
        doc.append("type", containerShip.getType());
        doc.append("length", containerShip.getLength());
        doc.append("beam", containerShip.getBeam());
        doc.append("draft", containerShip.getDraft());
        doc.append("capacity", containerShip.getCapacityTEU());
        doc.append("quantity", containerShip.getContainer());
        
        return doc;
    }
    
    
    private Object[] docToArrayObj(Document doc){
        Object[] dato = new Object[8];

        dato[0] = doc.getString("imo");
        dato[1] = doc.getString("name");
        dato[2] = doc.getString("type");
        dato[3] = doc.getString("length");
        dato[4] = doc.getString("beam");
        dato[5] = doc.getString("draft");
        dato[6] = doc.getString("capacity");
        dato[7] = doc.getString("quantity");

        return dato;
    }
    
    public ArrayList<Object[]> docListToArrayObjList(ArrayList<Document> documentos){
        ArrayList<Object[]> datos = new ArrayList<>();
        
        for (Document doc : documentos){
            datos.add(docToArrayObj(doc));
        }
        
        return datos;
    }
}
