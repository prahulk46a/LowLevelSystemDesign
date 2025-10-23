package DesignPatterns.FactoryDesignPattern.ProblematicCode;


public class Notify {
    public static void main(String[] args) {
        String type = "EMAIL";

        if ("EMAIL".equals(type)) {
            EmailNotification email = new EmailNotification();
            email.notifyUser();
        } else if ("SMS".equals(type)) {
            SmsNoification sms = new SmsNoification();
            sms.notifyUser();
        } else {
            System.out.println("Unknown type");
        }
    }
}
