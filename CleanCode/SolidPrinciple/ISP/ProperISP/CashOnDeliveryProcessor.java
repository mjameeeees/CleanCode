package SolidPrinciple.ISP.ProperISP;

public class CashOnDeliveryProcessor implements IOrderProcess{
    @Override
    public void validateShippingAddress(String address){
        System.out.println("Validating address: " + address);
    }

    @Override
    public void processOrder() {
        System.out.println("Processing order...");
    }
}
