package SolidPrinciple.OCP.ProperOCP;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String name, long accountNumber, double balance){
        super(name, accountNumber, balance);
    }
    @Override
    public void openAccount(){
        System.out.println("New Savings account has been added " + name + " (Account Number: " + accountNumber + ")");
    }
}
