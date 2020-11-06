package taskFromYouTube.task1WithAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public interface Music {



    String playSong();

    @PostConstruct
    default void init(){
        System.out.println("создан");
    }

    @PreDestroy
    default void destroy(){
        System.out.println("уничтожен");
    }
}
