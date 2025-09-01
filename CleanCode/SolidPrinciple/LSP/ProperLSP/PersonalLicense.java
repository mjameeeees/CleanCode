package SolidPrinciple.LSP.ProperLSP;

public class PersonalLicense extends License {
    @Override
    public double calculateFee(int months){
        return months * 10.0;
    }
}
