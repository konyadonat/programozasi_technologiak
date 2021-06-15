package VideoGame;

public interface VideoGame {
    String getName();
    void setName(String name);

    int getAmount();
    void setAmount(int amount);

    int getPrice();
    void setPrice(int price);

    int getReleaseYear();
    void setReleaseYear(int releaseYear);

    void discountByPercentage(int percentage);

}
