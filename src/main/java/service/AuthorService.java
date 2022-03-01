package service;

import DAO.AuthorDAOImpl;
import models.Author;

import java.util.List;

public class AuthorService {
    private AuthorDAOImpl authorDaoImpl = new AuthorDAOImpl();

    public AuthorService(){}

    public Author findById(int id){
        return authorDaoImpl.findById(id);
    }

    public void saveAuthor(Author author){
        authorDaoImpl.save(author);
    }

    public void deleteAuthor(Author author){
        authorDaoImpl.delete(author);
    }

    public void updateAuthor(Author author){
        authorDaoImpl.update(author);
    }

    public List<Author> findAllAuthors(){
        return authorDaoImpl.findAll();
    }

    @Override
    public String toString() {
        return "AuthorService{" +
                "authorDaoImpl=" + authorDaoImpl +
                '}';
    }
}
