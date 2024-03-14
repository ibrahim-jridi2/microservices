package com.example.candidate;

import com.example.candidate.Entity.Candidat;
import com.example.candidate.Repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidateApplication.class, args);
    }
    @Autowired
    private CandidatRepository repo;
    @Bean
    ApplicationRunner init(){
        return (args) ->{
            repo.save(new Candidat("ibrahim","jr","jr@jr.tn"));
            repo.save(new Candidat("ch","jr","ch@jr.tn"));
            repo.save(new Candidat("med","jr","med@jr.tn"));
            repo.findAll().forEach(System.out::println);
        };
    }
}
