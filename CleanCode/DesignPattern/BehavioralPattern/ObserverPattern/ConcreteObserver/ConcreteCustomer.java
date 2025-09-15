package BehavioralPattern.ObserverPattern.ConcreteObserver;
import BehavioralPattern.ObserverPattern.CustomerInterface.Customer;

public class ConcreteCustomer implements Customer {
    private String name;
    public ConcreteCustomer(String name) {
        this.name = name;
    }
    @Override
    public void update(String productName) {
        System.out.println("Hi " + name + ", the product " + productName + " is now available!");
    }
    @Override
    public String getName() {
        return name;
    }
}
