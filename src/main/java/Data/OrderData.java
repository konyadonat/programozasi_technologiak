package Data;

import Order.Order;

import java.util.List;


public interface OrderData {
    void addOrder(Order order);
    Order queryOrderById(int id);
    List<Order> queryOrders();
    void removeOrderById(int id);
}
