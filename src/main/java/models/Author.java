package models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String country;
    private Date birthday;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    public Author() {
    }

    public Author(String name, String country, Date birthday) {
        this.name = name;
        this.country = country;
        this.birthday = birthday;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        book.setAuthor(this);
        books.add(book);
    }

    @Override
    public String toString() {
        return "BookShop.author{" + "id = " + id +
                ", name = " + name +
                ", country = " + country +
                ", birthday = " + birthday +
                "}";
    }
}
