package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer costumer;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "summary_price")
    private int summaryPrice;
    @OneToMany(mappedBy = "orders")
    private List<OrderedBook> orderedBooks;

    public void addOrderedBook(Book book,int value) {
        OrderedBook orderedBook = new OrderedBook(value);
        orderedBook.setBook(book);
        orderedBook.setOrder(this);
        orderedBook.setTotalCost(value*(book.getPrice()));
        orderedBooks.add(orderedBook);
    }

    public Order() {
        this.orderDate = new Date();
    }

    public void calculateSum(){
        orderedBooks.forEach(orderedBook-> this.summaryPrice += orderedBook.getTotalCost());
    }

    @Override
    public String toString() {
        return "BookShop.Order{" +
                "id=" + id +
                ", customer=" + costumer +
                ", orderDate=" + orderDate +
                ", summaryPrice=" + summaryPrice +
                '}';
    }
}
