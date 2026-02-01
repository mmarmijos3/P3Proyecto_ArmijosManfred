package Model.DataBase;

import java.util.List;
import org.bson.Document;

/**
 *
 * @author Manfred Armijos
 */
public interface OperationsCRUD {
    
    public void create(Document document);

    public List<Document> read();
    
    public Document find(String filter);
    
    public void update(String filter, Document updates);

    public void delete(String filter);
    
    public void deleteCollection();

    public void deleteDatabase();
    
}
