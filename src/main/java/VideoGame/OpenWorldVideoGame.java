package VideoGame;

public abstract class OpenWorldVideoGame extends BasicVideoGame{


    public OpenWorldVideoGame(String name, int amount, int price, int releaseYear, int worldSize) {
        super(name, amount, price, releaseYear);
        setWorldSize(worldSize);
    }
    private int worldSize;


    public int getWorldSize() {
        return worldSize;
    }

    public void setWorldSize(int worldSize) {
        if(worldSize < 1)
            throw new RuntimeException("A világ mérete túl kicsi!");
        this.worldSize = worldSize;
    }
}
