package Data.Memory;

import Customer.Customer;
import Data.CustomerData;

import java.util.ArrayList;
import java.util.List;

public class MemoryCustomerData implements CustomerData {

    public MemoryCustomerData() {
        this.customers = new ArrayList<>();
    }


    List<Customer> customers;
    @Override
    public Customer queryCustomerByName(String name) {
        for(Customer c : customers){
            if(c.getName().equals(name))
                return c;
        }
        throw new RuntimeException("Ez a vásárló nem létezik!");
    }

    @Override
    public List<Customer> queryCustomers() {
        List<Customer> temp = new ArrayList<>();
        for(Customer c : customers)
            temp.add(c);
        return temp;
    }

    @Override
    public void removeCustomerByName(String name) {
        for (Customer c : customers){
            if(c.getName().equals(name)){
                customers.remove(c);
                return;
            }
        }
        throw new RuntimeException("Ez a vásárló nem létezik!");
    }

    @Override
    public void updateCustomer(Customer customer, Customer newCustomer) {
        for(Customer c : customers){
            if(newCustomer.getName().equals(c.getName()) && !customer.getName().equals(newCustomer.getName()))
                throw new RuntimeException("Ez a vásárló nem létezik!");
        }
        for(Customer c: customers){
            if(customer.getName().equals(c.getName())){
                c.setName(newCustomer.getName());
                c.setAge(newCustomer.getAge());
                c.setCountry(newCustomer.getCountry());
                c.setAddress(newCustomer.getAddress());
                return;
            }
        }
        throw new RuntimeException("Ez a vásárló nem létezik!");
    }

    @Override
    public void addCustomer(Customer customer) {
        for(Customer c: customers){
            if(c.getName().equals(customer.getName()))
                throw new RuntimeException("Ez a vásárló már létezik!");
        }
        customers.add(customer);
        return;
    }

    @Override
    public void removeCustomerByCustomer(Customer customer) {
        for (Customer c : customers){
            if(c.getName().equals(customer.getName())){
                customers.remove(c);
                return;
            }
        }

    }
}
