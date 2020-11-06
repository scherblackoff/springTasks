package taskFromYouTube.task1WithAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("rapMusic")
@Scope("singleton")
public class RapMusic implements Music {
    private Random random = new Random();
    private enum rapSongs{
        Rap_God,
        Mask_Off,
        Tantra
    }

    private String song = "Rap God";

    public String playSong() {
        int i = random.nextInt(rapSongs.values().length);
        return rapSongs.values()[i].toString();
    }
}
