package nu.ebat.ya.krutoi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("nu.ebat.ya.krutoi")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
