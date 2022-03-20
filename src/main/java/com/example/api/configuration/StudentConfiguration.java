package com.example.api.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfiguration {

    //add by default
//    @Bean
//    public CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args -> {
//            studentRepository.saveAll(List.of(
//                    new Student("Name1", LocalDate.of(2000, 12, 25), "email1@gmail.com"),
//                    new Student("Name2", LocalDate.of(2000, 06, 19), "email2@gmail.com")
//            ));
//        };
//    }

}
