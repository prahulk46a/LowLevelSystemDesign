package DesignPatterns.SingletonPattern.BetterCode;

public enum DatabaseConnection {
    INSTANCE;

    private int counter = 0;

    public void connect() {
        counter++;
        System.out.println("Connected to DB (" + counter + ")");
    }
}
