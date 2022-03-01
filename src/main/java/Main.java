import models.Book;
import models.Order;
import service.AuthorService;
import service.BookService;
import service.CostumerService;
import service.OrderService;
import models.Customer;

public class Main {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        CostumerService costumerService = new CostumerService();
        OrderService orderService = new OrderService();
        BookService bookService = new BookService();


        System.out.println(authorService.findById(1).getName());

        /*Customer customer = new Customer("Петя","Питер","999");
        costumerService.saveCustomer(customer);
        Order order = new Order();

        order.addOrderedBook(book,2);
        order.calculateSum();
        customer.addOrder(order);

        costumerService.saveCustomer(customer);
        orderService.saveOrder(order);*/
    }
}
