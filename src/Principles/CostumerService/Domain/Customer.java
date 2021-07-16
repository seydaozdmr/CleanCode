package Principles.CostumerService.Domain;

import java.util.List;

public class Customer {
    private String tckn;
    private String firstName;
    private String lastName;
    private String password;
    private boolean locked;
    private boolean loggedIn;
    private int invalidLoginCount;
    private List<Account> accounts;
    private Account defaultAccount;

    public Customer() {}

    public Customer(String tckn, String firstName, String lastName, String password, boolean locked, boolean loggedIn,
                    int invalidLoginCount) {
        this.tckn = tckn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.locked = locked;
        this.loggedIn = loggedIn;
        this.invalidLoginCount = invalidLoginCount;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public int getInvalidLoginCount() {
        return invalidLoginCount;
    }

    public void setInvalidLoginCount(int invalidLoginCount) {
        this.invalidLoginCount = invalidLoginCount;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
        for(Account account:this.accounts){
            if(account.isDefaultAccount())
                setDefaultAccount(account);
        }
    }

    public Account getDefaultAccount() {
        return defaultAccount;
    }

    public void setDefaultAccount(Account defaultAccount) {
        this.defaultAccount = defaultAccount;
    }
}
