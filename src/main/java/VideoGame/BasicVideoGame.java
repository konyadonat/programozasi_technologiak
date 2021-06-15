package VideoGame;

public abstract class BasicVideoGame implements VideoGame{

    public BasicVideoGame(String name, int amount, int price, int releaseYear) {
        setName(name);
        setAmount(amount);
        setPrice(price);
        setReleaseYear(releaseYear);

    }

    private String name;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name==null)
            throw new RuntimeException("A név nem lehet null!");
        if(name.length()<3)
            throw new RuntimeException("A név hossza legalalább 3 karakter!");
        if(name.length()>40)
            throw new RuntimeException("A név hossza maximum 40 karakter! (Ha hosszabb senki nem olvasse el)");
        this.name=name;
    }

     private int amount;
    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        if(amount < 1)
            throw new RuntimeException("A mennyiség legalább 1!");
        this.amount = amount;
    }
    private int price;
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        if(price<0)
            throw new RuntimeException("A játék ára nem lehet negatív!");
        this.price=price;
    }
    private int releaseYear;
    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public void setReleaseYear(int releaseYear) {
        if(releaseYear<1967)
            throw new RuntimeException("A megjelenés éve nem lehet kissebb mint 1967! (Első játék megjelenése)");
        if(releaseYear>2021)
            throw new RuntimeException("A játék még meg sem jelent!");
        this.releaseYear=releaseYear;
    }

    @Override
    public void discountByPercentage(int percentage) {
        double discountByPercentage = (100 + percentage) / 100.0;
        int newPrice = (int)(this.getPrice() * discountByPercentage);
        this.setPrice(newPrice);
    }
}
