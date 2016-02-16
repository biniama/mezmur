package tech.hasset;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tech.hasset.domain.Mezmur;
import tech.hasset.repo.MezmurRepository;

@SpringBootApplication
public class MezmurApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(MezmurApiApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(MezmurRepository mr) {

        return args -> {
            mr.save(new Mezmur("Title One", "Hello" + " World" + "!"));
            mr.save(new Mezmur("Title Two", "Hello" + " World Again" + "!"));

            mr.findAll().forEach(System.out::println);
        };
    }
}
