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
            mr.save(new Mezmur("ሰራዊተ መላእክቲሁ", "ሰራዊተ መላእክቲሁ\n" +
                    "ለመድኃኔዓለም ይቀውሙ\n" +
                    "የመድኃኔዓለም አገልጋዮቹ\n" +
                    "ይቆማሉ ከፊቱ መላእክቱ"));
            mr.save(new Mezmur("በጎል ሰከበ", "በጎል ሰከበ በአጽርቅት ተጠብለለ ኀደረ ማኅፀነ ድንግል\n" +
                    "እፎ ተሴሰየ(፪) ሀሊበ ከመህጻናት ተሴሰይ"));

            mr.findAll().forEach(System.out::println);
        };
    }
}
