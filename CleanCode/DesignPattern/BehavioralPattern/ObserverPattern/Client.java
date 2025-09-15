package BehavioralPattern.ObserverPattern;

import BehavioralPattern.ObserverPattern.ConcreteObserver.ConcreteCustomer;
import BehavioralPattern.ObserverPattern.ConcreteSubject.ConcreteStore;
import BehavioralPattern.ObserverPattern.CustomerInterface.Customer;

public class Client {
    public static void main(String[] args) {
        ConcreteStore store = new ConcreteStore("TechStore");
        
        Customer alice = new ConcreteCustomer("Alice");
        Customer bob   = new ConcreteCustomer("Bob");
        Customer carol = new ConcreteCustomer("Carol");
        
        // Customers subscribe to store
        store.registerCustomer(alice);
        store.registerCustomer(bob);
        
        // New product arrival
        store.productArrived("SuperPhone 3000");
        System.out.println("---");
        
        // Carol now subscribes
        store.registerCustomer(carol);
        
        // Another product
        store.productArrived("UltraPad X");
        System.out.println("---");
        
        // Alice unsubscribes
        store.unregisterCustomer(alice);
        
        // Another product
        store.productArrived("MegaWatch V2");
    }
}