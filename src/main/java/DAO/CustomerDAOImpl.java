package DAO;

import service.HibernateSessionFactoryUtil;
import models.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public Customer findByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Customer.class,id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateCustomer(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteCustomer(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM Customer ").list();
    }
}
