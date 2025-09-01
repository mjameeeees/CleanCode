package SolidPrinciple.ISP.ImproperISP;

public interface IOrderProcessor {
    public void validateCardInfo(int cardNumber);
    public void validateShippingAddress(String address);
    public void processOrder();
    
}
