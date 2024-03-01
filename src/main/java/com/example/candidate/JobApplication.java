package com.example.candidate;

import com.example.candidate.Entity.Job;
import com.example.candidate.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class, args);
    }
@Autowired
    private JobRepository repo;
    @Bean
    ApplicationRunner init(){
        return (args) ->{
            repo.save(new Job("aa",false));

            repo.findAll().forEach(System.out::println);
        };
    }
}
