package Order;

import Customer.Customer;
import Data.Memory.MemoryVideoGameData;

public class OrderBuilderImpl implements OrderBuilder{
    MemoryVideoGameData memoryVideoGameData;
    Customer customer;

    @Override
    public Order getOrder() {
        Order order=new OrderImpl(customer,memoryVideoGameData);
        return order;
    }

    @Override
    public OrderBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    @Override
    public OrderBuilder addVideoGameData(MemoryVideoGameData memoryVideoGameData) {
        this.memoryVideoGameData = memoryVideoGameData;
        return this;
    }
}
