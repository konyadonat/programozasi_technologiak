package Order;

import Customer.Customer;
import Data.Memory.MemoryVideoGameData;
import VideoGame.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class OrderImpl implements Order{

    public OrderImpl(int id, Customer customer, MemoryVideoGameData videogames){
        this.setId(id);
        this.setCustomer(customer);
        this.videogames = videogames;
    }

    public OrderImpl(Customer customer, MemoryVideoGameData videogames){
        this.setCustomer(customer);
        this.videogames = videogames;
    }


    private  int id;
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    private Customer customer;
    @Override
    public Customer getCustomer() {
        return customer;
    }

    private MemoryVideoGameData videogames;
    @Override
    public List<VideoGame> getVideoGamesByCustomer() {
        List<VideoGame> temp = new ArrayList<>();
        for(VideoGame v: videogames.queryVideoGame())
            temp.add(v);
        return temp;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
