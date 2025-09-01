package SolidPrinciple.ISP.ProperISP;

public class Client {
    public static void main(String[] args) {
        OnlineDeliveryProcess cod = new OnlineDeliveryProcess();
        cod.validateCardInfo(15465);
    }
}
