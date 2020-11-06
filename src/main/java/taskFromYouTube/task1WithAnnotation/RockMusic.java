package taskFromYouTube.task1WithAnnotation;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component("rockMusic")
public class RockMusic implements Music {

    private List<String> songs;

    private final Random random = new Random();
    private enum rockSongs{
        Bohemian_Rhapsody,
        Back_to_Black,
        Highway_to_hell
    }

    public String playSong() {
        int i = random.nextInt(rockSongs.values().length);
        return rockSongs.values()[i].toString();
    }
}
