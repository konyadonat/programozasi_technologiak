package Customer;

import VideoGame.VideoGame;
import Warehouse.Warehouse;

import java.util.List;

public interface Customer {
    String getName();
    void setName(String name);

    int getAge();
    void setAge(int age);

    String getCountry();
    void setCountry(String country);

    String getAddress();
    void setAddress(String address);

    List<VideoGame> getVideoGamesByCustomer();
    void addVideoGameToCart(VideoGame videoGame);

    void orderProducts(Warehouse warehouse);

}
