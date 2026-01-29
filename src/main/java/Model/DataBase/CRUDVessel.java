package Model.DataBase;

import com.mongodb.MongoException;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class CRUDVessel {

    private final MongoConnection mongo = MongoConnection.getInstance();

    public void create(Document document) {
        try {
            mongo.getCollection().insertOne(document);
        } catch (MongoException e) {
            throw new RuntimeException("Error CREATE", e);
        }
    }

    public List<Document> readAll() {
        List<Document> list = new ArrayList<>();
        try {
            mongo.getCollection().find().forEach(list::add);
        } catch (MongoException e) {
            throw new RuntimeException("Error READ", e);
        }
        return list;
    }

    public void deleteByImo(String imo) {
        try {
            mongo.getCollection().deleteOne(Filters.eq("imo", imo));
        } catch (MongoException e) {
            throw new RuntimeException("Error DELETE ONE", e);
        }
    }

    public void updateByImo(String imo, Document updates) {
        try {
            mongo.getCollection().updateOne(
                Filters.eq("imo", imo),
                new Document("$set", updates)
            );
        } catch (MongoException e) {
            throw new RuntimeException("Error UPDATE", e);
        }
    }

    public Document findByImo(String imo) {
        try {
            return mongo.getCollection().find(Filters.eq("imo", imo)).first();
        } catch (MongoException e) {
            throw new RuntimeException("Error SEARCH", e);
        }
    }

    public void deleteDatabase() {
        try {
            mongo.getCollection().drop();
        } catch (MongoException e) {
            throw new RuntimeException("Error DROP", e);
        }
    }
}