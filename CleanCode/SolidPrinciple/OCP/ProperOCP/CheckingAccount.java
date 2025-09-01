package SolidPrinciple.OCP.ProperOCP;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String name, long accountNumber, double balance){
        super(name, accountNumber, balance);
    }

    @Override
    public void openAccount(){
        System.out.println("New Checking account has been added " + name + " (Account Number: " + accountNumber + ")");
    }
}
