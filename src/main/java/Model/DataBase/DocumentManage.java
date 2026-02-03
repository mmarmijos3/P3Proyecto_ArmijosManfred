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
    
    public Document documentBill(Object[] bill){
        Document doc = new Document();
        
        doc.append("imo", bill[0]);
        doc.append("name", bill[1]);
        doc.append("type", bill[2]);
        doc.append("total", bill[3]);
  
        return doc;
    }
    
    
    private Object[] docToArrayObj(Document doc){
        Object[] dato = new Object[9];

        dato[0] = doc.getString("imo");
        dato[1] = doc.getString("name");
        dato[2] = doc.getString("type");
        dato[3] = doc.getString("category");
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
    
    public Object[] docToVesselInfo(Document doc){
        Object[] vesselInfo = new Object[9];

        vesselInfo[0] = doc.getString("imo");
        vesselInfo[1] = doc.getString("name");
        vesselInfo[2] = doc.getString("type");
        vesselInfo[3] = doc.getString("category");
        vesselInfo[4] = doc.getDouble("length");
        vesselInfo[5] = doc.getDouble("beam");
        vesselInfo[6] = doc.getDouble("draft");
        vesselInfo[7] = doc.getInteger("capacity");
        vesselInfo[8] = doc.getInteger("quantity");
        
        return  vesselInfo;
    }
}
