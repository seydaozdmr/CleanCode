package Principles.DependencyInversionExample;

public class AccountCreator {

    private AccountRepo repo;

    //dependency works on AccountRepo, we don't know which repo will be implement
    public AccountCreator(AccountRepo repo) {
        this.repo = repo;
    }

    public void saveAccount(AccountModel model){
        repo.createAccount(new Account(model));
    }
}
