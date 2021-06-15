package Customer;

public class CustomerFactoryImpl implements CustomerFactory{
    @Override
    public Customer createCustomer(String name, int age, String country, String address) {
        return new CustomerImpl(name,age,country,address);
    }
}
