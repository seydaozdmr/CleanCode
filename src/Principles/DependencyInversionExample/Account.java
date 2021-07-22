package Principles.DependencyInversionExample;

public class Account {
    private AccountModel model;

    public Account(AccountModel model) {
        this.model = model;
    }
}
