package nu.ebat.ya.krutoi;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>(Arrays.asList("Enter the sandman", "Cant stop", "breaking the law"));
    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(3));
    }
}
