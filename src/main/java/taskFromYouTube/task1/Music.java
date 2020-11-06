package taskFromYouTube.task1;

public interface Music {

    String playSong();

    default void init(){
        System.out.println("создан");
    }

    default void destroy(){
        System.out.println("уничтожен");
    }
}
