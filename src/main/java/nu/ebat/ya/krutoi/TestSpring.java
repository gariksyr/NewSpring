package nu.ebat.ya.krutoi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ClassicalMusic classic = context.getBean("classicalMusic",ClassicalMusic.class);
        classic.getSong();
//        Music music = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        context.close();
    }
}
