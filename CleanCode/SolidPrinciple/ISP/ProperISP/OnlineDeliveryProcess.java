package SolidPrinciple.ISP.ProperISP;

public class OnlineDeliveryProcess implements IOnlineOrderProcess, IOrderProcess {
    @Override
    public void validateCardInfo(int cardNumber) {
        System.out.println("Validating card info: " + cardNumber);
    }

    @Override
    public void validateShippingAddress(String address) {
        System.out.println("Validating card info: " + address);
    }

    @Override
    public void processOrder() {
        System.out.println("Process Order...");
    }
}
