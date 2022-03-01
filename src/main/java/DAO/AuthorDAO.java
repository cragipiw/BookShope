package DAO;

import models.Author;

import java.util.List;

public interface AuthorDAO{
    Author findById(int id);
    void save(Author author);
    void update(Author author);
    void delete(Author author);
    List<Author> findAll();
}
