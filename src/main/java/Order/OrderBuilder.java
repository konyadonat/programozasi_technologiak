package Order;

import Customer.Customer;
import Data.Memory.MemoryVideoGameData;

public interface OrderBuilder {

    Order getOrder();

    OrderBuilder setCustomer(Customer customer);

    OrderBuilder addVideoGameData(MemoryVideoGameData memoryVideoGameData);
}
