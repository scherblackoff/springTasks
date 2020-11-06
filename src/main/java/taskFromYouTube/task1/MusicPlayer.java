package taskFromYouTube.task1;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    private List<Music> music = new ArrayList<Music>();
    private int volume;
    private String name;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < music.size(); i++) {
            stringBuilder.append(music.get(i).playSong() + "\n");
        }
        return String.valueOf(stringBuilder);
    }

    public void playMusic(){
        for (Music comp: music) {
            System.out.println("Playing " + comp.playSong());
        }
    }
}
