package SolidPrinciple.SRP.ProperSRP;

public class Accounting {
    public int calculatePay(Employee emp){
        return emp.getTotalWorkedHours() * 100;
    }
}
