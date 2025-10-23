package DesignPatterns.FactoryDesignPattern.BetterCode;
/*
* Factory Pattern provides an interface for creating objects, but lets subclasses decide which class to instantiate.
* Key Idea: Don’t call new directly. Ask the factory to create objects for you.
* */

public interface Notification {
    default void Notification(){
        System.out.println("Notification Executed");
    }
    void notifyUser();

}
