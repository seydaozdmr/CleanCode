package Principles.CostumerService.Dao;

import Principles.CostumerService.Domain.Customer;

public interface Dao {
    /**
     * This interface about persistence
     * creating, retrieving, deleting, updating, refreshing customer
     *
     */

    boolean createCustomer(Customer customer);
    Customer retrieveCustomer(String name);
    Customer refreshCustomer(Customer customer);
    Customer deleteCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
}
