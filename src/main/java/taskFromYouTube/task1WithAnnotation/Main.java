package taskFromYouTube.task1WithAnnotation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        ClassicMusic classicMusic1 = context.getBean("classicalMusic", ClassicMusic.class);
        ClassicMusic classicMusic2 = context.getBean("classicalMusic", ClassicMusic.class);
        System.out.println(classicMusic1 == classicMusic2);
        RapMusic rapMusic1 = context.getBean("rapMusic", RapMusic.class);
        RapMusic rapMusic2 = context.getBean("rapMusic", RapMusic.class);
        System.out.println(rapMusic1 == rapMusic2);
    }
}
