package taskFromYouTube.task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music musicBean = context.getBean("musicBeanRap", Music.class);
        Music musicBean1 = context.getBean("musicBeanRock", Music.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer1.toString());
        System.out.println(musicPlayer);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer1 == musicPlayer);
        context.close();
        System.out.println("re");
    }
}
