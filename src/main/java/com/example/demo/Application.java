package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.model.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student Maria = new Student(
                    "Maria",
                    "Petrova",
                    "Maria@mail.ru",
                    25
                    );
            studentRepository.save(Maria);
        };
    }

}
