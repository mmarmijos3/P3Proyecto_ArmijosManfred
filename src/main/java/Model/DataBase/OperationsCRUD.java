package Model.DataBase;

import java.util.List;
import org.bson.Document;

/**
 *
 * @author Manfred Armijos
 */
public interface OperationsCRUD {
    
    public void setCollection(String collection);
    
    public void create(Document document);

    public List<Document> read();
    
    public List<Document> find(String key, String filter);
    
    public void update(String key, Object filter, Document updates);

    public void delete(String key, Object filter);
    
    public void deleteCollection();

    public void deleteDatabase();
    
}
