package SolidPrinciple.OCP.ViolatesOCP;

public class Client {
    
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Mark James Dinong", 1876789, 120059);
        acc.newSavingsAccount();
        

    }
    
    
}
