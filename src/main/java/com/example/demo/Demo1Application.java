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
    public CommandLineRunner demo(UserRepository userRepository, RolRepository rolRepository, TaskRepository taskRepository) {
        return (args) -> {
            //lo que vamos a recibir (USER)

//            User user = new User();
//            user.setUsername("prueba1");
//            user.setPassword("1234");
//            user.setIdrol(1);
//            userRepository.save(user);

            //task

//            Task task = new Task();
//            task.setIdtask(2);
//            task.setIduser(7);
//            task.setTitle("Hacer deberes de lengua");
//            task.setDescription("Los deberes de lengua");
//            LocalDateTime createDate = LocalDateTime.now(); // Fecha actual
//            LocalDateTime deadline = LocalDateTime.of(2024, 3, 25, 12, 0);
//            task.setCreate_date(createDate);
//            task.setDeadline(deadline);
//            task.setStatus(Task.Status.PENDIENTE);
//            taskRepository.save(task);


        };
    }
}
