package nu.ebat.ya.krutoi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    String name;
    @Value("${musicPlayer.volume}")
    int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicGenre musicGenre) {
        if (musicGenre.equals(MusicGenre.ROCK)) {
            return "Playing: " + music1.getSong();
        } else {
            return "Playing: " + music2.getSong();
        }
    }
}
