package BehavioralPattern.ObserverPattern.PublisherInterface;

import BehavioralPattern.ObserverPattern.CustomerInterface.Customer;

public interface Store {
    void registerCustomer(Customer customer);   // subscribe
    void unregisterCustomer(Customer customer); // unsubscribe
    void notifyCustomers(String productName);   // notify all
    void productArrived(String productName);    // invoked when a product becomes available

}
