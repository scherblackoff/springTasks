package taskFromYouTube.task1WithAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("computer")
public class Computer {
    @Value("12332")
    private int id;
    private MusicPlayer musicPlayer;


    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                '}' + "\n" + musicPlayer.playMusic(MusicGenre.RAP);
    }
}
