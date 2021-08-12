package Principles.InsuranceExample.Solution;

public class HealthInsuranceSurveyor extends InsuranceSurveyor{
    @Override
    boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        return true;
    }
}
