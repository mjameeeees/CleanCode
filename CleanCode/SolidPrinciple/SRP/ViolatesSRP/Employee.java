public class Employee {
    private int totalHoursWorked;
    
    public Employee(int totalHoursWorked){
        this.totalHoursWorked = totalHoursWorked;
    }

    public int getTotalHoursWorkes(){
        return totalHoursWorked;
    }

    public double calculatePay() {
        // logic to calculate pay
        return totalHoursWorked * 100; // sample
    }

    public String reportHours() {
        // logic to report hours
        return "Total hours worked: " + totalHoursWorked;
    }

    public void saveEmployee() {
        // logic to save employee in database
        System.out.println("Employee saved to database.");
    }
}