package SolidPrinciple.OCP.ProperOCP;

public abstract class BankAccount {
    protected String name;
    protected long accountNumber;
    protected double balance;

    public BankAccount(String name,long accountNumber, double balance ){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        balance+=depositAmount;
        System.out.println("Successfully deposit to " + name + ", (Account number: " + accountNumber + ") with the amount of " + balance);
    }
    public void withdraw(double withdrawAmount){
        balance-=withdrawAmount;
        System.out.println("Successfully deposit to " + name + ", (Account number: " + accountNumber + ") with the amount of " + balance);
    }

    public void getBalance(){
        System.out.println("Total Balance: " + balance);
    }

    public abstract void openAccount();

}
