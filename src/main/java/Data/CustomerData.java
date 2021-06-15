package Data;

import Customer.Customer;

import java.util.List;

public interface CustomerData {
    Customer queryCustomerByName(String name);
    List<Customer> queryCustomers();

    void removeCustomerByCustomer(Customer customer);
    void removeCustomerByName(String name);

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer, Customer newCustomer);


}
