package Model.DataBase;

import com.mongodb.MongoException;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class CRUDBills implements OperationsCRUD {

    private final MongoConnection mongo = MongoConnection.getInstance();

    @Override
    public void create(Document document) {
        mongo.setCollectionName("Bills");
        try {
            mongo.getCollection().insertOne(document);
        } catch (MongoException e) {
            throw new RuntimeException("Error CREATE", e);
        }
    }

    @Override
    public List<Document> read() {
        mongo.setCollectionName("Bills");
        List<Document> list = new ArrayList<>();
        try {
            mongo.getCollection().find().forEach(list::add);
        } catch (MongoException e) {
            throw new RuntimeException("Error READ", e);
        }
        return list;
    }

    @Override
    public List<Document> find(String imo) {
        mongo.setCollectionName("Bills");
        List<Document> list = new ArrayList<>();
        try {
            mongo.getCollection().find(Filters.eq("imo", imo)).forEach(list::add);
        } catch (MongoException e) {
            throw new RuntimeException("Error SEARCH", e);
        }
        return list;
    }

    @Override
    public void delete(Object id) {
        mongo.setCollectionName("Bills");
        try {
            mongo.getCollection().deleteOne(Filters.eq("_id", (ObjectId)id));
        } catch (MongoException e) {
            throw new RuntimeException("Error DELETE ONE", e);
        }
    }

    @Override
    public void update(Object id, Document updates) {
        mongo.setCollectionName("Bills");
        try {
            mongo.getCollection().updateOne(
                Filters.eq("_id", (ObjectId)id),
                new Document("$set", updates)
            );
        } catch (MongoException e) {
            throw new RuntimeException("Error UPDATE", e);
        }
    }

    @Override
    public void deleteCollection() {
        mongo.setCollectionName("Bills");
        try {
            mongo.getCollection().deleteMany(new Document());
        } catch (MongoException e) {
            throw new RuntimeException("Error al borrar coleccion", e);
        }
    }

    @Override
    public void deleteDatabase() {
        mongo.setCollectionName("Bills");
        try {
            mongo.getCollection().drop();
        } catch (MongoException e) {
            throw new RuntimeException("Error DROP", e);
        }
    }
}
