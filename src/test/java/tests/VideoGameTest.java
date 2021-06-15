package tests;

import VideoGame.MMORPGVideoGame;
import VideoGame.Prototype.WoWMMORPGVideoGame;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class VideoGameTest {

    @Test
    public void NameNullTest(){

    }

    @Test
    public void DiscountBy50Test(){
        WoWMMORPGVideoGame woWMMORPGVideoGame = new WoWMMORPGVideoGame(
                "World of Wacraft",5,13000,2018,3500);
        woWMMORPGVideoGame.EditPriceByPercentage(-50);
        Assertions.assertEquals(6500,woWMMORPGVideoGame.getPrice());

    }

}
