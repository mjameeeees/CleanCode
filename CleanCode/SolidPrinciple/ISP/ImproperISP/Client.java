package SolidPrinciple.ISP.ImproperISP;

public class Client {
    public static void main(String[] args) {
    CashOnDeliveryProcessor cod = new CashOnDeliveryProcessor();
    cod.processOrder();  
    }
}
