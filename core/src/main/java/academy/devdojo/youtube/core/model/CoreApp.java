package academy.devdojo.youtube.core.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CoreApp {

    public static void main(String[] args) {
        SpringApplication.run(CoreApp.class, args);
    }

}