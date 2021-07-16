package Principles.CostumerService.Service;

import Principles.CostumerService.Domain.Account;
import Principles.CostumerService.Domain.Customer;

public interface CustomerService {
    /**
     * This interface about Customer
     *
     *
     */

    boolean lockCustomer(Customer customer);

    boolean changePassword (Customer customer,String newPassword);
    Account getDefaultAccount(Customer customer);
    Customer getCurrentCustomer();

    void checkIfCustomerAlreadyLoggedIn(Customer customer);
    void checkIfCustomerLocked(Customer customer);

}
