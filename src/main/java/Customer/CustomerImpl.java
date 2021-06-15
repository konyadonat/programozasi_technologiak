package Customer;

import VideoGame.VideoGame;


import java.util.List;

public class CustomerImpl implements Customer{

    private String name;

    public CustomerImpl(String name, int age, String country, String address) {
        this.setName(name);
        this.setAge(age);
        this.setCountry(country);
        this.setAddress(address);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name==null)
            throw new RuntimeException("A név nem lehet null!");
        if (name.length()<2)
            throw new RuntimeException("A név legalább 2 karakter!");
        this.name = name;
    }
    private int age;
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        if (age<=0)
            throw new RuntimeException("A vásárló életkora nem lehet negatív vagy 0!");
        if (age>120)
            throw new RuntimeException("A vásárló életkora nem lehet több mint 120 év!");
        this.age = age;

    }
    private String country;
    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        if(country==null)
            throw new RuntimeException("A vásárló országa nem lehet null!");
        if(country.length()<3)
            throw new RuntimeException("A vásárló oszága legalább 3 karakter hosszú!");
        this.country = country;
    }
    private String address;
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        if(address == null)
            throw new RuntimeException("A vásárló címe nem lehet null!");
        if(address.length() <= 3)
                throw new RuntimeException("A vásárló címe legalább 3 karakter!");
        this.address=address;
    }




}
