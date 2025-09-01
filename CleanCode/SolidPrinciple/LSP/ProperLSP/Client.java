package SolidPrinciple.LSP.ProperLSP;
    
public class Client {
        public static void main(String[] args) {
            License personal = new PersonalLicense();
            System.out.println("Monthly Fee: " + personal.calculateFee(5));
        }
}
