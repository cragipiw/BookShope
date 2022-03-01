package models;

import enums.BookCoverType;
import enums.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Setter
@Getter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "book_name")
    private String bookName;
    private Date date;
    @Column(name = "cover_type")
    private String coverType;
    private int price;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    private Category category;
    /*@OneToMany
    private List<OrderedBook> orderedBooks;*/


    public Book() {

    }

    public Book(String bookName, Date date, int price) {
        this.bookName = bookName;
        this.date = date;
        this.price = price;
    }

    /*public void addOrderedBook(OrderedBook orderedBook){
        orderedBook.setBook(this);
        orderedBooks.add(orderedBook);
    }*/

    @Override
    public String toString() {
        return "BookShop.Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", date=" + date +
                ", coverType=" + coverType +
                ", price=" + price +
                ", author=" + author +
                ", category=" + category +
                '}';
    }
}
