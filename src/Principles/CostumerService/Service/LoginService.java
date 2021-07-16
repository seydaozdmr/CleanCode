package Principles.CostumerService.Service;

import Principles.CostumerService.Domain.Customer;

public interface LoginService {
    void login(String userName,String password);
    boolean logout(Customer customer);

}
