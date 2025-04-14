package nu.ebat.ya.krutoi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>(Arrays.asList("Polka", "Polet schmelya", "Polet valkyrae"));
    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(3));
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("ya INIT");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("ya Destroy");
    }
}
