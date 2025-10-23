package DesignPatterns.FactoryDesignPattern.BetterCode;

public class Notify {
    public static void main(String[] args) {
        Notification emailNotification =NotificationFactory.createNotification("EMAIL");
        emailNotification.notifyUser();

        Notification smsNotification =NotificationFactory.createNotification("SMS");
        smsNotification.notifyUser();
    }
}
