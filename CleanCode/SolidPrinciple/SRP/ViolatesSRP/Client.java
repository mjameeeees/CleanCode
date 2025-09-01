import SolidPrinciple.SRP.ProperSRP.Accounting;
import SolidPrinciple.SRP.ProperSRP.Employee;
import SolidPrinciple.SRP.ProperSRP.HumanResource;

public class Client {
    public static void main(String[] args) {
     
            Employee emp = new Employee(40);
            HumanResource getReport = new HumanResource();
            Accounting getSalary = new Accounting();

            System.out.println(emp.getTotalWorkedHours());
            System.out.println(getReport.getReportHours(emp));
            System.out.println(getSalary.calculatePay(emp));
    }
}
