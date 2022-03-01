package DAO;

import service.HibernateSessionFactoryUtil;
import models.Author;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {

    @Override
    public Author findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Author.class,id);
    }

    @Override
    public void save(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(author);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(author);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Author> findAll() {
        return (List<Author>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM Author ").list();
    }
}
