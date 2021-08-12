package Principles.InsuranceExample.Problem;

public class ClaimApprovalManager {
    /**
     * bu sınıfta bulunan processHealthClaim methodu HealthInsuranceSurveyor sınıfından bir
     * nesne alıyor ve bu nesneye ait mothodu çağırıyor.
     *
     * İlk başta baktığımızda bu durum Single Responsible Principle 'a uygun. İki sınıf ta farklı
     * işler yapıyorlar.
     *
     * Fakat aralarındaki bağımlılık somut nesne üzerinden. Programın iletleyen zamanlarında
     * VehicleInsuranceSurveyor -> araçlar için sigorta durumunun kontrol edilmesi gerekirse
     * bu durum için yeni bir method yazmamız gerekir ya da if else kullanmak zorunda kalırız.
     * Oysa bizim tek bir methodumuz iki durumu da gerçekleştirebilir.
     */


    public void processHealthClaim(HealthInsuranceSurveyor healthInsuranceSurveyor){
        if(healthInsuranceSurveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
