package Order;

import Customer.Customer;
import VideoGame.VideoGame;

import java.util.List;

public interface Order {
    
    int getId();
    void setId(int id);

    Customer getCustomer();
    void setCustomer(Customer customer);

    List<VideoGame> getVideoGamesByCustomer();
}
