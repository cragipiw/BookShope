package DAO;

import service.HibernateSessionFactoryUtil;
import models.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDAOImpl implements BookDAO{

    @Override
    public Book findByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Book.class,id);
    }

    @Override
    public void saveBook(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateBook(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(book);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteBook(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(book);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Book> getAllBooks() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM Book ").list();
    }
}
