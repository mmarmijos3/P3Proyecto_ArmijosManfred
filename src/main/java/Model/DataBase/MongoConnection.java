package Model.DataBase;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoConnection {

    private static MongoConnection instance;
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    private final String DATABASE_NAME = "P2Proyecto_ArmijosManfred";
    private final String COLLECTION_NAME = "VesselQueue";

    private MongoConnection() {
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            database = mongoClient.getDatabase(DATABASE_NAME);
            collection = database.getCollection(COLLECTION_NAME);
            System.out.println("Conexión a MongoDB OK");
        } catch (MongoException e) {
            System.out.println("Fallo al conectar a MongoDB: " + e.getMessage());
        }
    }

    public static MongoConnection getInstance() {
        if (instance == null) {
            instance = new MongoConnection();
        }
        return instance;
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }

    public void close() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("Conexion cerrada");
        }
    }
}