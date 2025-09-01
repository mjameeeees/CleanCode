package SolidPrinciple.SRP.ProperSRP;

public class Employee {
    private int totalHoursWorked;

    public Employee(int totalHoursWorked){
        this.totalHoursWorked = totalHoursWorked;
    }   

    public int getTotalWorkedHours(){
        return totalHoursWorked;
    }
}
