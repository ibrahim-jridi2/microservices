package com.example.candidate.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    @GeneratedValue
    private int id;
    private String service;
    private boolean etat;


    public Job(String service, boolean etat) {
        this.service = service;
        this.etat = etat;
    }

    public boolean isEtat() {
        return etat;
    }
}
