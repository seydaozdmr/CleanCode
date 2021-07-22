package Principles.AccountService;

public class Program {
    public static void main(String[] args) {
        AddressService addressService=new AddressService();
        Address address= addressService.getAddressForUser(25);
        AccountService.ChangeAddress(address);
    }


}
