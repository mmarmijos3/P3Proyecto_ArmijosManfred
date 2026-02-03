package Model.DataBase;

import com.mongodb.MongoException;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class CRUDVessel implements OperationsCRUD {

    private final MongoConnection mongo = MongoConnection.getInstance();

    @Override
    public void create(Document document) {
        mongo.setCollectionName("VesselQueue");
        try {
            mongo.getCollection().insertOne(document);
        } catch (MongoException e) {
            throw new RuntimeException("Error CREATE", e);
        }
    }

    @Override
    public List<Document> read() {
        mongo.setCollectionName("VesselQueue");
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
        mongo.setCollectionName("VesselQueue");
        List<Document> list = new ArrayList<>();
        try {
            mongo.getCollection().find(Filters.eq("imo", imo)).forEach(list::add);
        } catch (MongoException e) {
            throw new RuntimeException("Error SEARCH", e);
        }
        return list;
    }

    @Override
    public void delete(String imo) {
        mongo.setCollectionName("VesselQueue");
        try {
            mongo.getCollection().deleteOne(Filters.eq("imo", imo));
        } catch (MongoException e) {
            throw new RuntimeException("Error DELETE ONE", e);
        }
    }

    @Override
    public void update(String imo, Document updates) {
        mongo.setCollectionName("VesselQueue");
        try {
            mongo.getCollection().updateOne(
                Filters.eq("imo", imo),
                new Document("$set", updates)
            );
        } catch (MongoException e) {
            throw new RuntimeException("Error UPDATE", e);
        }
    }

    @Override
    public void deleteCollection() {
        mongo.setCollectionName("VesselQueue");
        try {
            mongo.getCollection().deleteMany(new Document());
        } catch (MongoException e) {
            throw new RuntimeException("Error al borrar coleccion", e);
        }
    }

    @Override
    public void deleteDatabase() {
        mongo.setCollectionName("VesselQueue");
        try {
            mongo.getCollection().drop();
        } catch (MongoException e) {
            throw new RuntimeException("Error DROP", e);
        }
    }
}
