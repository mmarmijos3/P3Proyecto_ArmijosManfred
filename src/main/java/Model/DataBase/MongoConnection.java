package Model.DataBase;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import org.bson.Document;

public class MongoConnection {

    private static MongoConnection instance;
    private MongoClient mongoClient;
    private MongoDatabase database;

    private final String DATABASE_NAME = "P2Proyecto_ArmijosManfred";
    private final String COLLECTION_NAME = "VesselQueue";
    private final String CLIENT_URL = "mongodb://localhost:27017";

    private MongoConnection() {
        try {
            mongoClient = MongoClients.create(CLIENT_URL);
            database = mongoClient.getDatabase(DATABASE_NAME);
            
            if (!database.listCollectionNames()
                    .into(new ArrayList<>())
                    .contains(COLLECTION_NAME)) {

                database.createCollection(COLLECTION_NAME);
            }
            
        } catch (MongoException e) {
            throw new RuntimeException("Error connecting to MongoDB", e);
        }
    }

    public static MongoConnection getInstance() {
        if (instance == null) {
            instance = new MongoConnection();
        }
        return instance;
    }

    public MongoCollection<Document> getCollection() {
        return database.getCollection(COLLECTION_NAME);
    }

    public void closeDatabase() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}