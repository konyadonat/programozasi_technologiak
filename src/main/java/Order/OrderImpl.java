package Order;

import Customer.Customer;
import VideoGame.VideoGame;

import java.util.List;

public class OrderImpl implements Order{

    private  int id;
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {

    }
    private Customer customer;
    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public List<VideoGame> getVideoGamesByCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }
}
