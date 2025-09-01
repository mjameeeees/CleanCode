package SolidPrinciple.OCP.ViolatesOCP;

public class BankAccount {
    private String name;
    private long accountNumber;
    private double balance;

    public BankAccount(String name, long accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void newSavingsAccount(){
        System.out.println("Added savings account to "+ name + " with account number: " + accountNumber);
    }

    public void newCheckingAccount(){
        System.out.println("Added checking account " + name + " with account number: " + accountNumber);
    }

    public void deposit(){
        System.out.println("Deposited to " + name + " with account number: " + accountNumber);
    }

    public double withdraw(double amountWithdraw){
        return amountWithdraw;
    }

    public double getBalance(){
        return balance;
    }


}
