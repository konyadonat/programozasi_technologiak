package tests;

import VideoGame.Prototype.WoWMMORPGVideoGame;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WowPrototypeTest {

    @Test
    public void PrototypeTest(){
        WoWMMORPGVideoGame woWMMORPGVideoGame = new WoWMMORPGVideoGame(
                "World of Warcraft",
                30,
                14000,
                2010,
                3500
        );
        WoWMMORPGVideoGame woWMMORPGVideoGame1 = (WoWMMORPGVideoGame)  woWMMORPGVideoGame.copy();

        woWMMORPGVideoGame1.setName("Word of Warcraft Classic");

        Assertions.assertEquals(woWMMORPGVideoGame.getPrice(),woWMMORPGVideoGame1.getPrice());

    }
}
