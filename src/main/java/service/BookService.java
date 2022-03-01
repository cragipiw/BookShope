package service;

import DAO.BookDAOImpl;
import models.Book;

import java.util.List;

public class BookService {
    private BookDAOImpl bookDao = new BookDAOImpl();

    public BookService(){

    }

    public Book findByID(int id){
        return bookDao.findByID(id);
    }

    public void saveBook(Book book){
        bookDao.saveBook(book);
    }

    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(Book book){
        bookDao.deleteBook(book);
    }

    public List<Book> getAllBooks(){
        return bookDao.getAllBooks();
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
