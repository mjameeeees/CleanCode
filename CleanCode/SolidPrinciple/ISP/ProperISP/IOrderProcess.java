package SolidPrinciple.ISP.ProperISP;

public interface IOrderProcess {
    public void processOrder();
    public void validateShippingAddress(String address);
}
