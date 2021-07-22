package Principles.AccountService;

public class AccountService {

    public static void ChangeAddress(Address address){
        RequireCheck.Check(i->i>500, address.ZipCode);
        System.out.println("Account address has been changed");
    }
}
