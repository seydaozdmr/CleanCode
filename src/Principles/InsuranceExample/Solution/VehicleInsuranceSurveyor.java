package Principles.InsuranceExample.Solution;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor{
    @Override
    boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        return true;
    }
}
