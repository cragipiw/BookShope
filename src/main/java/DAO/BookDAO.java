package DAO;

import models.Book;

import java.util.List;

public interface BookDAO {
    Book findByID(int id);
    void saveBook(Book book);
    void updateBook(Book book);
    void deleteBook(Book book);
    List<Book> getAllBooks();
}
