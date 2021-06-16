package tests;

import VideoGame.Prototype.WoWMMORPGVideoGame;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WowPrototypeTest {

    @Test
    public void SameNamePrototypeTest(){
        WoWMMORPGVideoGame woWMMORPGVideoGame = new WoWMMORPGVideoGame(
                "World of Warcarft",
                30,
                14000,
                2010,
                3500
        );
        WoWMMORPGVideoGame woWMMORPGVideoGame1 = (WoWMMORPGVideoGame)  woWMMORPGVideoGame.copy();

        Assertions.assertEquals(woWMMORPGVideoGame.getName(),woWMMORPGVideoGame1.getName());

    }
}
