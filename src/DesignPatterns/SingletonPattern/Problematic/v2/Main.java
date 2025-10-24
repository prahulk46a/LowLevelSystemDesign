package DesignPatterns.SingletonPattern.Problematic.v2;


public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db1 == db2); // true
        db1.connect();
    }
}
