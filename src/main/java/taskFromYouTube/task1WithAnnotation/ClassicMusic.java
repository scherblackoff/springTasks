package taskFromYouTube.task1WithAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("classicalMusic")
@Scope("prototype")
public class ClassicMusic implements Music {
    private final Random random = new Random();

    private enum classicalSongs{
        Hungarian_Rhapsody,
        Ave_Maria,
        The_Seasons
    }

    public String playSong() {
        int i = random.nextInt(classicalSongs.values().length);
        return classicalSongs.values()[i].toString();
    }
}
