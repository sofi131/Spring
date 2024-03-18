package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootApplication
public class Demo1Application {
    private static final Logger log = LoggerFactory.getLogger(Demo1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    //crear USUARIO
    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {
            //lo que vamos a recibir
            Optional<User> user=userRepository.findById(2);
            System.out.println(user.get().toString());
//            User user = new User();
//            user.setUsername("prueba1");
//            user.setPassword("1234");
//            user.setIdrol(1);
//            userRepository.save(user);
        };

    }
    //crear rol
    //crear TASK
//    @Bean
//    public CommandLineRunner demo(TaskRepository taskRepository) {
//        return (args) -> {
//            Task task = new Task();
//            task.setTitle("Hacer deberes de inglés");
//            task.setDescription("Los deberes de inglés");
//            LocalDateTime createDate = LocalDateTime.now(); // Fecha actual
//            LocalDateTime deadline = LocalDateTime.of(2024, 3, 25, 12, 0);
//            taskRepository.save(task);
//            //task.setStatus("Pendiente");
//        };
//
//    }

}
