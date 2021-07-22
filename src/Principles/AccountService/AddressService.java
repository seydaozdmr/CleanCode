package Principles.AccountService;

public class AddressService {

    public Address getAddressForUser(int userId){
        RequireCheck.Check(i->i>10,userId);

        Address address = new Address();
        address.city="Ankara";
        address.Country="Turkey";
        address.state="IcAnadolu";
        address.ZipCode=600;
        address.street="Bahceli Evler";

        RequireCheck.Check(i->i>500, address.ZipCode);
        return address;

    }
}

