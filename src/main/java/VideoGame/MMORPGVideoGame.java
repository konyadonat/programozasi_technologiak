package VideoGame;

public abstract class MMORPGVideoGame extends BasicVideoGame{
    public MMORPGVideoGame(String name, int amount, int price, int releaseYear, int subscriptionPrice) {
        super(name, amount, price, releaseYear);
        setSubscriptionPrice(subscriptionPrice);
    }

    private int subscriptionPrice;


    public int getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(int subscriptionPrice) {
        if(subscriptionPrice<0)
            throw new RuntimeException("Az előfizetés ára nem lehet negatív!");
        this.subscriptionPrice = subscriptionPrice;
    }

    public abstract MMORPGVideoGame copy();
}
