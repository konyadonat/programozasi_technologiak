package VideoGame;

public abstract class BasicVideoGame implements VideoGame{
    public BasicVideoGame(String name, int amount, int price, int releaseYear) {
        setName(name);
        setAmount(amount);
        setPrice(price);
        setReleaseYear(releaseYear);

    }

    String name;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    int amount;
    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {

    }
    int price;
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {

    }
    int releaseYear;
    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public void setReleaseYear(int releaseYear) {

    }

    @Override
    public void discountByPercentage(int percentage) {

    }
}
