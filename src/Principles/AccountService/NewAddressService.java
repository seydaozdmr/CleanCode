package Principles.AccountService;

public class NewAddressService extends AddressService{
    @Override
    public Address getAddressForUser(int userId) {
        /**
         * Liskov Substitution Prensibine göre miras alınan bir sınıfın methodlarının ön ve son koşullarını daha sıkı hale
         * getirmemeli
         */
        RequireCheck.Check(i->i>10,userId);
        RequireCheck.Check(i->i<20,userId);

        Address address = new Address();
        address.city="Ankara";
        address.Country="Turkey";
        address.state="IcAnadolu";
        address.ZipCode=600;
        address.street="Bahceli Evler";

        RequireCheck.Check(i->i>1000, address.ZipCode);
        return address;
    }
}
