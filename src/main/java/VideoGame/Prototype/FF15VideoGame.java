package VideoGame.Prototype;

import VideoGame.MMORPGVideoGame;

public class FF15VideoGame extends MMORPGVideoGame {
    public FF15VideoGame(String name, int amount, int price, int releaseYear, int subscriptionPrice) {
        super(name, amount, price, releaseYear, subscriptionPrice);
    }

    @Override
    public MMORPGVideoGame copy() {
        VideoGame.Prototype.FF15VideoGame ff15VideoGame = new VideoGame.Prototype.FF15VideoGame(
                this.getName(),this.getAmount(),this.getPrice(),this.getReleaseYear(),this.getSubscriptionPrice()
        );
        return ff15VideoGame;
    }
}
