package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", "meriam@gmail.com", LocalDate.of(2000, JANUARY, 5));

            Student Alex = new Student( "ALex", "alex@gmail.com", LocalDate.of(2002, JANUARY, 5));

            repository.saveAll(List.of(mariam,Alex));
        };
    }
}
