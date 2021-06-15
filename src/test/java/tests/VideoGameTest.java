package tests;

import VideoGame.MMORPGVideoGame;
import VideoGame.OpenWorldVideoGame;
import VideoGame.Prototype.WoWMMORPGVideoGame;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class VideoGameTest {

    @Test
    public void NameNullTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                    null,50,3000,2020,5);
        });
        String expectedMessage = "A név nem lehet null!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void DiscountBy50Test(){
        WoWMMORPGVideoGame woWMMORPGVideoGame = new WoWMMORPGVideoGame(
                "World of Warcraft",5,13000,2018,3500);
        woWMMORPGVideoGame.EditPriceByPercentage(-50);
        Assertions.assertEquals(6500,woWMMORPGVideoGame.getPrice());

    }

}
