package Model.DataBase;

/**
 *
 * @author Armijos Manfred, Balseca Valeska
 */

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import org.bson.Document;

/*
class that handles the connection to MongoDB and performs CRUD operations
*/
public class MongoConnection2 {
    private static MongoConnection2 instance;
    private MongoClient mongoClient;
    private final String nameDatabase = "P2Proyecto_Armijos_Balseca";
    private MongoDatabase mongoDatabase;
    private final String nameCollecion = "Queue";
    private MongoCollection<Document> collection;
    
    // Constructor
    private MongoConnection2() {
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            mongoDatabase = mongoClient.getDatabase(nameDatabase);
            collection = mongoDatabase.getCollection(nameCollecion);
            //System.out.println("Conectado a MongoDB: " + nameDatabase);
        } catch (MongoException e) {
            //System.out.println("Error conectando a MongoDB");
        }
    }
    
    /*
    call the constructor only if no previous instance exists
    */
    public static MongoConnection2 getInstance() {
        if (instance == null) {
            instance = new MongoConnection2();
        }
        return instance;
    }
   

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }

    public void setMongoDatabase(MongoDatabase mongoDatabase) {
        this.mongoDatabase = mongoDatabase;
    }

    public String getNameCollecion() {
        return nameCollecion;
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }
    
    /*
    method that sends a document to the collection 
    */
    public boolean create(Document document) {
        try {  
            if (getMongoDatabase()!= null) {
                getCollection();
                getCollection().insertOne(document);
                return true;
            }
        }catch (MongoException e) {
            System.out.println("Error sending JSON document");
        }
        return false;
    }
    
    /*
    method that returns a list of all documents read
    */
    public ArrayList<Document> read() {
        ArrayList<Document> list = new ArrayList<>();
        for (Document doc : getCollection().find()) {
            list.add(doc);
        }
        return list;
    }
    
    /*
    method that removes a document from the collection,
    it deletes it if it finds a vessel with the given IMO number.
    */
    public boolean deleteDocument(String imo) {
        try {
            if (getMongoDatabase() != null) {
                getCollection().deleteOne(Filters.eq("imo", imo));
                return true;
            }
        } catch (MongoException e) {
            //e.printStackTrace();
        }
        return false;
    }
    
    /*
    The method deletes the entire collection, in this case the queue.
    */
    public boolean deleteCollection() {
        try {
            getCollection().deleteMany(new Document());
            return true;
        } catch (MongoException e) {
            return false;
        }
    }
    
    /*
    method that deletes the entire database
    */
    public boolean deleteDatabase() {
        try {
            if (getMongoDatabase() != null) {
                getMongoDatabase().drop();
                return true;
            }
        } catch (MongoException e) {
            // Fail
        }
        return false;
    }
    
    /*
    method that finds a vessel with a given 
    IMO number and updates it with new information
    */
    public boolean update(String imo, Document newDoc) {
        try {
            //use of the search method
            Document filtro = searchDocument(imo);
            getCollection().updateOne(filtro, new Document("$set", newDoc));
            return true;
        } catch (MongoException e) {
            return false;
        }
    }
    
    /*
    method that returns the document searched for by IMO
    */
    public Document searchDocument(String imo) {
        try {
            return getCollection().find(Filters.eq("imo", imo)).first(); 
        } catch (MongoException e) {
            return null;
        }
    }
    
}
