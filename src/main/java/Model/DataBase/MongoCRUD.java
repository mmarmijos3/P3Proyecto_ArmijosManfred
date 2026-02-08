package Model.DataBase;

import com.mongodb.MongoException;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class MongoCRUD implements OperationsCRUD {

    private final MongoConnection mongo;

    public MongoCRUD(String collectionName) {
        this.mongo = MongoConnection.getInstance();
        mongo.setCollectionName(collectionName);
    }

    @Override
    public void create(Document document) {
        try {
            mongo.getCollection().insertOne(document);
        } catch (MongoException e) {
            throw new RuntimeException("Error CREATE", e);
        }
    }

    @Override
    public List<Document> read() {
        List<Document> list = new ArrayList<>();
        try {
            mongo.getCollection().find().forEach(list::add);
        } catch (MongoException e) {
            throw new RuntimeException("Error READ", e);
        }
        return list;
    }

    @Override
    public List<Document> find(String key, String imo) {
        List<Document> list = new ArrayList<>();
        try {
            mongo.getCollection().find(Filters.eq(key, imo)).forEach(list::add);
        } catch (MongoException e) {
            throw new RuntimeException("Error SEARCH", e);
        }
        return list;
    }

    @Override
    public void delete(String key, Object id) {
        try {
            mongo.getCollection().deleteOne(Filters.eq(key, (ObjectId)id));
        } catch (MongoException e) {
            throw new RuntimeException("Error DELETE ONE", e);
        }
    }

    @Override
    public void update(String key, Object id, Document updates) {
        try {
            mongo.getCollection().updateOne(
                Filters.eq(key, (ObjectId)id),
                new Document("$set", updates)
            );
        } catch (MongoException e) {
            throw new RuntimeException("Error UPDATE", e);
        }
    }

    @Override
    public void deleteCollection() {
        try {
            mongo.getCollection().deleteMany(new Document());
        } catch (MongoException e) {
            throw new RuntimeException("Error al borrar coleccion", e);
        }
    }

    @Override
    public void deleteDatabase() {
        try {
            mongo.getCollection().drop();
        } catch (MongoException e) {
            throw new RuntimeException("Error DROP", e);
        }
    }

    @Override
    public void setCollection(String name){
        mongo.setCollectionName(name);
    }
}
