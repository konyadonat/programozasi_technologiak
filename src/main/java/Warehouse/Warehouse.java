package Warehouse;

import Customer.Customer;
import Order.Order;
import VideoGame.VideoGame;

import java.util.List;

public interface Warehouse {
    void addVideoGame(VideoGame videoGame);
    List<VideoGame> getVideoGames();
    VideoGame getVideoGamesByName(String name);

    void addCustomer(Customer c);
    List<Customer> getCustomers();
    Customer getCustomerByName(String name);

    void addOrder(Order o);
    List<Order> getOrders();
    Order getOrderById(int id);
    void orderAddToCustomer(String name);

    void addOrderToCustomerByName(String name);
    void addProductToCustomerByName(VideoGame videoGame,String name);
}
