package Warehouse;

import Customer.Customer;
import Data.Memory.MemoryCustomerData;
import Data.Memory.MemoryOrderData;
import Data.Memory.MemoryVideoGameData;
import Order.Order;
import Supplier.BasicSupplier;
import VideoGame.VideoGame;

import java.util.List;

public class BasicWarehouse implements Warehouse{

    public BasicWarehouse(){
         memoryVideoGameData= new MemoryVideoGameData();
         memoryOrderData = new MemoryOrderData();
         memoryCustomerData = new MemoryCustomerData();

    }
    private static BasicWarehouse basicWarehouse = null;
    public static BasicWarehouse getInstance(){
        if(basicWarehouse==null)
            basicWarehouse = new BasicWarehouse();
        return basicWarehouse;
    }
    MemoryVideoGameData memoryVideoGameData;
    MemoryOrderData memoryOrderData;
    MemoryCustomerData memoryCustomerData;


    @Override
    public void addVideoGame(VideoGame videoGame) {
        memoryVideoGameData.addVideoGame(videoGame);
    }

    @Override
    public List<VideoGame> getVideoGames() {
        return memoryVideoGameData.queryVideoGame();
    }

    @Override
    public VideoGame getVideoGamesByName(String name) {
        return memoryVideoGameData.queryVideoGameByName(name);
    }

    @Override
    public void addCustomer(Customer c) {
        memoryCustomerData.addCustomer(c);
    }

    @Override
    public List<Customer> getCustomers() {
        return memoryCustomerData.queryCustomers();
    }
    
    @Override
    public Customer getCustomerByName(String name) {
        return memoryCustomerData.queryCustomerByName(name);
    }

    @Override
    public void addOrder(Order o) {
        memoryOrderData.addOrder(o);
    }

    @Override
    public List<Order> getOrders() {
        return memoryOrderData.queryOrders();
    }

    @Override
    public Order getOrderById(int id) {
        return memoryOrderData.queryOrderById(id);
    }

    @Override
    public void orderAddToCustomer(String name) {
        memoryCustomerData.queryCustomerByName(name).orderProducts(this);
    }

    @Override
    public void addOrderToCustomerByName(String name) {
        memoryCustomerData.queryCustomerByName(name).orderProducts(this);
    }

    @Override
    public void addProductToCustomerByName(VideoGame videoGame, String name) {
        memoryCustomerData.queryCustomerByName(name).addVideoGameToCart(videoGame);
    }
}
