package Supplier;

import VideoGame.VideoGame;
import Warehouse.Warehouse;

public interface Supplier {

    String getName();
    int getId();
    void SupplyBySupplier(VideoGame videoGame, Warehouse w);
}
