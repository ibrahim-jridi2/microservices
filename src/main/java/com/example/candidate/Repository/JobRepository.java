package com.example.candidate.Repository;

import com.example.candidate.Entity.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JobRepository extends JpaRepository<Job,Integer> {
//@Query("Select j from Job j where j.service like :service")
//    Page<Job> jobByName(@Param("service") String service, Pageable pageable);
    Page<Job> findJobByIdOrService(int id,String service, Pageable pageable);
}
