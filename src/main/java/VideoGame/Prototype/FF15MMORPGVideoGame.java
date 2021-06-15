package VideoGame.Prototype;

import VideoGame.MMORPGVideoGame;

public class FF15MMORPGVideoGame extends MMORPGVideoGame {
    public FF15MMORPGVideoGame(String name, int amount, int price, int releaseYear, int subscriptionPrice) {
        super(name, amount, price, releaseYear, subscriptionPrice);
    }

    @Override
    public MMORPGVideoGame copy() {
        FF15MMORPGVideoGame ff15MMORPGVideoGame = new FF15MMORPGVideoGame(
                this.getName(),this.getAmount(),this.getPrice(),this.getReleaseYear(),this.getSubscriptionPrice()
        );
        return ff15MMORPGVideoGame;
    }
}
