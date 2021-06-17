package tests;

import Customer.CustomerImpl;
import VideoGame.OpenWorldVideoGame;
import Warehouse.BasicWarehouse;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WarehouseTest {

    @Test
    public void CustomerNameTest() {
        CustomerImpl customer = new CustomerImpl(
                "Kónya Donát",
                20,
                "Hungary",
                "Bem út 15");



        BasicWarehouse.getInstance().addCustomer(customer);


        CustomerImpl customer1 = new CustomerImpl(
                "Kónya Donát",
                20,
                "Hungary",
                "Bem út 15");


        Assertions.assertEquals(
                BasicWarehouse.getInstance().getCustomerByName(customer.getName()).getName(),
                customer1.getName()
        );
    }
}
