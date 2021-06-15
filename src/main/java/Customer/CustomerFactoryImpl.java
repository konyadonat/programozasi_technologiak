package Customer;

public class CustomerFactoryImpl implements CustomerFactory{

    private static CustomerFactoryImpl customerFactory=null;
    private CustomerFactoryImpl(){

    }

    public static CustomerFactoryImpl getInstance(){
        if(customerFactory == null)
            customerFactory= new CustomerFactoryImpl();
        return customerFactory;
    }

    @Override
    public Customer createCustomer(String name, int age, String country, String address) {
        return new CustomerImpl(name,age,country,address);
    }
}
