package tests;

import Data.Memory.MemoryVideoGameData;
import VideoGame.OpenWorldVideoGame;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MemoryVideoGamesDataTest {

    @Test
    public void getVideoGamesTest(){
        OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                "Skyrim",
                15,
                3000,
                2010,
                20
        );
        MemoryVideoGameData data = new MemoryVideoGameData();
        data.addVideoGame(openWorldVideoGame);
        Assertions.assertEquals(openWorldVideoGame, data.queryVideoGameByName(openWorldVideoGame.getName()));
    }

    @Test
    public void getVideoGamesAmountTest(){
        OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                "Skyrim",
                15,
                3000,
                2010,
                20
        );
        MemoryVideoGameData data = new MemoryVideoGameData();
        data.addVideoGame(openWorldVideoGame);

        OpenWorldVideoGame openWorldVideoGame2 = new OpenWorldVideoGame(
                "Skyrim",
                15,
                3000,
                2010,
                20
        );
        data.addVideoGame(openWorldVideoGame2);

        Assertions.assertEquals(30,data.queryVideoGameByName(openWorldVideoGame2.getName()).getAmount());
    }

    @Test
    public void buyTest(){
        OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                "Skyrim",
                15,
                3000,
                2010,
                20
        );
        MemoryVideoGameData data = new MemoryVideoGameData();
        data.addVideoGame(openWorldVideoGame);

        data.removeVideoGameByName("Skyrim");

        Assertions.assertEquals(14,data.queryVideoGameByName(openWorldVideoGame.getName()).getAmount());
    }

    @Test
    public void priceDecreaseBy50PercentTest(){
        OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                "Skyrim",
                15,
                3000,
                2010,
                20
        );
        MemoryVideoGameData data = new MemoryVideoGameData();
        data.addVideoGame(openWorldVideoGame);

        data.updateVideoGamePrice(openWorldVideoGame,-50);

        Assertions.assertEquals(1500,data.queryVideoGameByName(openWorldVideoGame.getName()).getPrice());
    }

    @Test
    public void priceIncreaseBy50PercentTest(){
        OpenWorldVideoGame openWorldVideoGame = new OpenWorldVideoGame(
                "Skyrim",
                15,
                3000,
                2010,
                20
        );
        MemoryVideoGameData data = new MemoryVideoGameData();
        data.addVideoGame(openWorldVideoGame);

        data.updateVideoGamePrice(openWorldVideoGame,50);

        Assertions.assertEquals(4500,data.queryVideoGameByName(openWorldVideoGame.getName()).getPrice());
    }


}
