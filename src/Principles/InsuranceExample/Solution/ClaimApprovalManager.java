package Principles.InsuranceExample.Solution;

public class ClaimApprovalManager {
    //Burada ise bağımlılık InsuranceSurveyor abstract sınıfı üzerinden gerçekleşiyor.
    //Bu soyut sınıfı extend eden her sınıf isValidClaim() methodunu override edeceği için
    //istediğimiz InsuranceSurveyor u getirip kullanabiliriz.
    public void processInsuranceClaim(InsuranceSurveyor insuranceSurveyor){
        if(insuranceSurveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
