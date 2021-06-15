package Data.Memory;

import Data.VideoGameData;
import VideoGame.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class MemoryVideoGameData implements VideoGameData {

    public MemoryVideoGameData(){
        this.videoGames = new ArrayList<VideoGame>();
    }
    List<VideoGame> videoGames;

    @Override
    public VideoGame queryVideoGameByName(String name) {
        for(VideoGame p : videoGames){
            if(p.getName().equals(name))
                return p;
        }
        throw new RuntimeException("Ez a játék nem található!");
    }

    @Override
    public List<VideoGame> queryVideoGame() {
        List<VideoGame> temp = new ArrayList<VideoGame>();
        for (VideoGame p : videoGames)
            temp.add(p);
        return temp;
    }

    @Override
    public void removeVideoGameByName(String name) {
        for (VideoGame p :videoGames){
            if(p.getName().equals(name)){
                p.changeAmount(-1);
                return;
            }
        }
        throw new RuntimeException("Ez a játék nem található!");
    }

    @Override
    public void updateVideoGamePrice(VideoGame videoGame, int percentage) {
        for (VideoGame p : videoGames){
            if(p.getName().equals(videoGame.getName())){
                p.EditPriceByPercentage(percentage);
                return;
            }
        }
        throw new RuntimeException("Ez a játék nem található!");
    }

    @Override
    public void buyVideoGame(VideoGame videoGame) {
        for(VideoGame p : videoGames){
            if(p.getName().equals(videoGame.getName())){
                p.changeAmount(-1);
                return;
            }
        }
    }

    @Override
    public void addVideoGame(VideoGame videoGame) {
        for (VideoGame p : videoGames){
            if(p.getName().equals(videoGame.getName())){
                p.changeAmount(videoGame.getAmount());
                return;
            }

        }
        videoGames.add(videoGame);
    }

    @Override
    public void removeVideoGameByVideoGame(VideoGame videoGame) {
        for (VideoGame p : videoGames){
            if(p.getName().equals(videoGame.getName())){
                p.changeAmount(-(videoGame.getAmount()));
                if(p.getAmount()==0)
                    videoGames.remove(p);
                return;
            }
        }
    }
}
