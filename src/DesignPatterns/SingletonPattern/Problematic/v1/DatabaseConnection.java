package DesignPatterns.SingletonPattern.Problematic.v1;
/*
* Basic implementation of Singleton design pattern=>
* Not Thread Safe=>If two threads call getInstance() at the same time, both can create separate instances.
* Not Synchronised=>Deserialization may also create a new instance.
* No protection against reflection=> Reflection can still create another instance.
*  */

public class DatabaseConnection {
    private static DatabaseConnection connection =new DatabaseConnection();

    private DatabaseConnection(){
        System.out.println("Basic Singleton created!");
    }

    public static DatabaseConnection getInstance(){
        return connection;
    }

    public void connect() {
        System.out.println("Connected to database...");
    }
}
