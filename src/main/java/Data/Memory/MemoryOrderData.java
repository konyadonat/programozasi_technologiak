package Data.Memory;

import Data.OrderData;
import Order.Order;

import java.util.ArrayList;
import java.util.List;

public class MemoryOrderData implements OrderData {
    public MemoryOrderData(){
        orders=new ArrayList<>();
    }
    private List<Order> orders;

    @Override
    public void addOrder(Order order) {
        order.setId(orders.size() + 1);
        orders.add(order);
    }

    @Override
    public Order queryOrderById(int id) {
        for(Order o : orders){
            if(o.getId() == id)
                return o;
        }
        throw new RuntimeException("Nincs ilyen order!");
    }

    @Override
    public List<Order> queryOrders() {
        List<Order> temp = new ArrayList<>();
        for(Order o : orders)
            temp.add(o);
        return temp;
    }

    @Override
    public void removeOrderById(int id) {
        for(Order o : orders){
            if(o.getId() == id)
                orders.remove(o);
        }
        throw new RuntimeException("Nincs ilyen order!");
    }
}
