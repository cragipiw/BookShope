package DAO;

import models.Customer;

import java.util.List;

public interface CustomerDAO {
    Customer findByID(int id);
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    List<Customer> getAllCustomers();
}
