package VideoGame.Prototype;

import VideoGame.MOBAVideoGame;


public class LoLMobaVideoGame extends MOBAVideoGame {
    public LoLMobaVideoGame(String name, int amount, int price, int releaseYear, int teamSize) {
        super(name, amount, price, releaseYear, teamSize);
    }

    @Override
    public MOBAVideoGame copy() {
        VideoGame.Prototype.LoLMobaVideoGame loLMobaVideoGame = new VideoGame.Prototype.LoLMobaVideoGame(
                this.getName(),this.getAmount(),this.getPrice(),this.getReleaseYear(),this.getTeamSize()
        );
        return loLMobaVideoGame;
    }


}
