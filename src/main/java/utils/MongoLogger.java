package utils;


import com.mongodb.client.*;
import org.bson.Document;

public class MongoLogger {
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DB_NAME = "AutoTestHub";
    private static final String COLLECTION_NAME = "testResults";

    private static MongoClient mongoClient = MongoClients.create(CONNECTION_STRING);
    private static MongoCollection<Document> collection = mongoClient.getDatabase(DB_NAME).getCollection(COLLECTION_NAME);

    public static void logResult(String testName, String status) {
        Document doc = new Document("testName", testName)
                .append("status", status)
                .append("timestamp", System.currentTimeMillis());
        collection.insertOne(doc);
    }
}
