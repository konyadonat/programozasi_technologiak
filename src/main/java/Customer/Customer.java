package Customer;

import VideoGame.VideoGame;

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
    
}
