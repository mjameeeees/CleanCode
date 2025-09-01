package SolidPrinciple.ISP.ImproperISP;

public class OnlineOrderProcessor implements IOrderProcessor {
    @Override
    public void validateCardInfo(int number){
        System.out.println("Validating Card: " + number);
    }

    @Override
    public void validateShippingAddress(String address){
         System.out.println("Validating Card: " + address);
    }

    @Override
    public void processOrder(){
        System.out.println("Processing Order...");
    }
}
