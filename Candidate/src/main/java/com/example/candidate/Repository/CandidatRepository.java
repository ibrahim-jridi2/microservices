package com.example.candidate.Repository;

import com.example.candidate.Entity.Candidat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CandidatRepository extends JpaRepository<Candidat,Integer> {
@Query("Select c from Candidat c where c.nom like :nom")
    Page<Candidat> candidatByName(@Param("nom") String nom, Pageable pageable);
}
