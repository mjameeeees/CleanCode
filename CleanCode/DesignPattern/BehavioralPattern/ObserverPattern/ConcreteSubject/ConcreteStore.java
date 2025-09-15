package BehavioralPattern.ObserverPattern.ConcreteSubject;

import java.util.ArrayList;
import java.util.List;

import BehavioralPattern.ObserverPattern.CustomerInterface.Customer;
import BehavioralPattern.ObserverPattern.PublisherInterface.Store;

public class ConcreteStore implements Store {
    private List<Customer> customers = new ArrayList<>();
    private String storeName;

    public ConcreteStore(String name) {
        this.storeName = name;
    }

    @Override
    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void unregisterCustomer(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomers(String productName) {
        for (Customer c : customers) {
            c.update(productName);
        }
    }

    @Override
    public void productArrived(String productName) {
        System.out.println("Store " + storeName + ": Product " + productName + " has arrived.");
        notifyCustomers(productName);
    }
}
