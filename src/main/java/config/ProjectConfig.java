package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean                /*Добавление в контекст Spring строки Hello*/
    String hello(){
        return "Hello";
    }
    @Bean               /*Добавление в контекст Spring целого числа 10*/
    Integer ten(){
        return 10;
    }
}
