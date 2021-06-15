package Data;

import VideoGame.VideoGame;

import java.util.List;

public interface VideoGameData {
    VideoGame queryVideoGameByName(String name);
    List<VideoGame> queryVideoGame();

    void removeVideoGameByVideoGame(VideoGame videoGame);
    void removeVideoGameByName(String name);

    void addVideoGame(VideoGame videoGame);
    void buyVideoGame(VideoGame videoGame);

    void updateVideoGamePrice(VideoGame videoGame, int percentage);
}
