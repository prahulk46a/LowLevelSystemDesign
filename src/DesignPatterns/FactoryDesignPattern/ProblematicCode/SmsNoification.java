package DesignPatterns.FactoryDesignPattern.ProblematicCode;

public class SmsNoification implements Notification {

    @Override
    public void notifyUser() {
        Notification();
        System.out.println("Notification Send via SMS...");
    }
}