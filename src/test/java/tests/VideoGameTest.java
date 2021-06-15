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
    public void NameTooShortTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                    "ez",50,3000,2020,5);
        });
        String expectedMessage = "A név hossza legalalább 3 karakter!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void NameTooLongTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
                    50,3000,2020,5);
        });
        String expectedMessage = "A név hossza maximum 40 karakter! (Ha hosszabb senki nem olvasse el)";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    public void ChangeAmountTest(){

       OpenWorldVideoGame openWorldVideoGame= new OpenWorldVideoGame(
               "Valami",50,3000,2020,15);
       openWorldVideoGame.changeAmount(-10);

       Assertions.assertEquals(40,openWorldVideoGame.getAmount());
    }

    @Test
    public void ChangeAmountMinusTest(){

        Exception exception = Assertions.assertThrows(RuntimeException.class, ()->{
            OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                    "Valami",50,3000,2020,5);
            openWorldVideoGame.changeAmount(-70);
        });

        String expectedMessage = "A játék elfogyott!";
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

    @Test
    public void IncreaseBy50Test(){
        WoWMMORPGVideoGame woWMMORPGVideoGame = new WoWMMORPGVideoGame(
                "World of Warcraft",5,13000,2018,3500);
        woWMMORPGVideoGame.EditPriceByPercentage(50);
        Assertions.assertEquals(19500,woWMMORPGVideoGame.getPrice());

    }

}
