package Supplier;

import VideoGame.VideoGame;
import Warehouse.Warehouse;

public class BasicSupplier implements Supplier{

    private static BasicSupplier basicSupplier = null;
    public static BasicSupplier getInstance(){
        if(basicSupplier == null)
            basicSupplier = new BasicSupplier();
        return basicSupplier;
    }

    private String name;
    @Override
    public String getName() {
        return name;
    }
    private  int id;
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void SupplyBySupplier(VideoGame videoGame, Warehouse w) {
        w.addVideoGame(videoGame);
    }
}
