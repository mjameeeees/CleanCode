package SolidPrinciple.ISP.ImproperISP;

public class CashOnDeliveryProcessor implements IOrderProcessor {
    @Override
    public void validateCardInfo(int cardNumber){
            throw new UnsupportedOperationException("Can validate card number.");
    }

    @Override
    public void validateShippingAddress(String address){
        System.out.println("Validating address: " + address);
    }

    @Override
    public void processOrder(){
        System.out.println("Processing order...");
    }
}