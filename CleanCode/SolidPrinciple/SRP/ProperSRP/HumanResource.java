package SolidPrinciple.SRP.ProperSRP;

public class HumanResource {
    public String getReportHours(Employee emp){
        return "Total Report Hours: " + emp.getTotalWorkedHours();
    }   
}
