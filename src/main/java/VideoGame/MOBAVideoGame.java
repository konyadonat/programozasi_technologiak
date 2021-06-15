package VideoGame;

public abstract class MOBAVideoGame extends BasicVideoGame{
    public MOBAVideoGame(String name, int amount, int price, int releaseYear,int teamSize) {
        super(name, amount, price, releaseYear);
        setTeamSize(teamSize);
    }

    private int teamSize;

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if(teamSize<2)
            throw new RuntimeException("A csapat legalaább 2 ember!");
        this.teamSize = teamSize;
    }

    public abstract MOBAVideoGame copy();

}
