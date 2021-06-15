package tests;

import Customer.CustomerImpl;
import Order.Order;
import Order.OrderBuilderImpl;
import VideoGame.OpenWorldVideoGame;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OrderTest {

    @Test
    public void OrderBuilder(){
        CustomerImpl customer = new CustomerImpl(
                "Teszt Elek",
                50,
                "Magyarország",
                "Almagyár út 55");

        OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                "Skyrim",
                20,
                3000,
                2010,
                20
        );
        customer.addVideoGameToCart(openWorldVideoGame);
        OrderBuilderImpl builder = new OrderBuilderImpl();
        builder.setCustomer(customer);
        builder.addVideoGameData(customer.getVideoGameDatas());
        Order order = builder.getOrder();
        Assertions.assertTrue(order.getVideoGamesByCustomer().contains(openWorldVideoGame));
    }
}
