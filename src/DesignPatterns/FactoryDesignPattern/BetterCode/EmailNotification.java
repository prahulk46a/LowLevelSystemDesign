package DesignPatterns.FactoryDesignPattern.BetterCode;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        Notification();
        System.out.println("Notification Send via Email...");
    }
}
