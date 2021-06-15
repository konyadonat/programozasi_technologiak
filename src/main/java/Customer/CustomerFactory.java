package Customer;

public interface CustomerFactory {
    Customer createCustomer(String name,int age, String country,String address);
}
