package DesignPatterns.SingletonPattern.Problematic.v3;
/*
Issues=>
Complex and error-prone
Double-checked locking is subtle — easy to implement incorrectly (for example, forgetting volatile used to break thread safety before Java 5).
Harder to read and maintain, especially for beginners.
*/
public class DatabaseConnection {
    private static volatile  DatabaseConnection connection;

    public static DatabaseConnection getInstance(){
        if (connection == null) { // first check (no locking)
            synchronized (DatabaseConnection.class) {  //Threadsafe instance creation
                if (connection == null) { // second check (with lock)
                    connection = new DatabaseConnection();
                }
            }
        }
        return connection;
    }

    public void connect() {
        System.out.println("Connected to database...");
    }
}
