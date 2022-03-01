package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Entity
@Table(name = "ordered_book")
public class OrderedBook implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Id
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    private int value;
    @Column(name = "total_cost")
    private int totalCost;

    public OrderedBook(){}

    public OrderedBook(int value) {
        this.value = value;
    }
}
