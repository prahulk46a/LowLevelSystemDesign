package DesignPatterns.SingletonPattern.Problematic.v2;
/*
issues=>
Not thread-safe — if two threads call getInstance() at the same time, both can create separate instances.
No protection against reflection — reflection can still create another instance.
No protection against serialization — deserialization may also create a new instance.
*/

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database Connection created!");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) { // Not thread-safe
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to database...");
    }


}