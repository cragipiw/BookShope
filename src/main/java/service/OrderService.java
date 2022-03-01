package service;

import DAO.OrderDAOImpl;
import models.Order;

import java.util.List;

public class OrderService {
    OrderDAOImpl orderDAO = new OrderDAOImpl();

    public Order findById(int id){
        return orderDAO.findByID(id);
    }

    public void saveOrder(Order order){
        orderDAO.saveOrder(order);
    }

    public void updateOrder(Order order){
        orderDAO.updateOrder(order);
    }

    public void deleteOrder(Order order){
        orderDAO.deleteOrder(order);
    }

    public List<Order> getAllOrders(){
        return orderDAO.getAllOrders();
    }
}
