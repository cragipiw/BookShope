package service;


import DAO.CustomerDAOImpl;
import models.Customer;

import java.util.List;

public class CostumerService {
    CustomerDAOImpl costumerDAO = new CustomerDAOImpl();

    public Customer findById(int id){
        return  costumerDAO.findByID(id);
    }

    public void saveCustomer(Customer customer){
        costumerDAO.saveCustomer(customer);
    }

    public void updateCustomer(Customer customer){
        costumerDAO.updateCustomer(customer);
    }

    public void deleteCustomer(Customer customer){
        costumerDAO.deleteCustomer(customer);
    }

    public List<Customer> getAllCustomers(){
        return costumerDAO.getAllCustomers();
    }
}
