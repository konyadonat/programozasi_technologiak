package VideoGame;

public interface VideoGame {
    String getName();
    void setName(String name);

    int getAmount();
    void changeAmount(int amount);

    int getPrice();
    void setPrice(int price);

    int getReleaseYear();
    void setReleaseYear(int releaseYear);

    void EditPriceByPercentage(int percentage);

}
