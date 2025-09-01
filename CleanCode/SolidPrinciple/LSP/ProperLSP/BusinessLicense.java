package SolidPrinciple.LSP.ProperLSP;

public class BusinessLicense extends License {
    @Override
    public double calculateFee(int months){
        return months * 12.00;
    }
}
