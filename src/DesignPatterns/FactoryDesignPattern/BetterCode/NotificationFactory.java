package DesignPatterns.FactoryDesignPattern.BetterCode;


public class NotificationFactory {
    public static Notification createNotification(String type){
        switch(type) {
            case "EMAIL": return new EmailNotification();
            case "SMS":   return new SmsNoification();
            default: throw new IllegalArgumentException("Unknown type");
        }
    }
}
