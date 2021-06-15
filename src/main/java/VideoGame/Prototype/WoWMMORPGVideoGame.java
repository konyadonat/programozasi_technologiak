package VideoGame.Prototype;

import VideoGame.MMORPGVideoGame;

public class WoWMMORPGVideoGame extends MMORPGVideoGame {
    public WoWMMORPGVideoGame(String name, int amount, int price, int releaseYear, int subscriptionPrice) {
        super(name, amount, price, releaseYear, subscriptionPrice);
    }

    @Override
    public MMORPGVideoGame copy() {
        VideoGame.Prototype.WoWMMORPGVideoGame woWMMORPGVideoGame = new VideoGame.Prototype.WoWMMORPGVideoGame(
                this.getName(),this.getAmount(),this.getPrice(),this.getReleaseYear(),this.getSubscriptionPrice()
        );
        return woWMMORPGVideoGame;
    }
}
