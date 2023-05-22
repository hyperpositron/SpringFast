package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean                /*Добавление в контекст Spring строки Hello*/
    String hello() {
        return "Hello";
    }

    @Bean               /*Добавление в контекст Spring целого числа 10*/
    Integer ten() {
        return 10;
    }

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
}
