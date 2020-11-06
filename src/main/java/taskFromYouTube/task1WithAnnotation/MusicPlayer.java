package taskFromYouTube.task1WithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("musicPlayer")
public class MusicPlayer {

    private final Random random = new Random();

    @Autowired
    @Qualifier("classicalMusic")
    private Music music1;

    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    @Autowired
    @Qualifier("rapMusic")
    private Music music3;


    /*public MusicPlayer(@Qualifier("rockMusic")Music music) {
        this.music = music;
    }*/


    public String playMusic(MusicGenre genre){

        String song;

        if(genre == MusicGenre.CLASSICAL){
            song = music1.playSong();
        }else if(genre == MusicGenre.ROCK){
            song = music2.playSong();
        }else{
            song = music3.playSong();
        }
            return "Playing " + song;
    }
}
