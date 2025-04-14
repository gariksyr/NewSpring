package nu.ebat.ya.krutoi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
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
