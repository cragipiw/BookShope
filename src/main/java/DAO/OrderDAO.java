package DAO;

import models.Order;

import java.util.List;

public interface OrderDAO {
    Order findByID(int id);

    void saveOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(Order order);

    List<Order> getAllOrders();
}
