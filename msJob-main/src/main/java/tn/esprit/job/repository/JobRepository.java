package tn.esprit.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.job.entity.Job;

public interface JobRepository  extends JpaRepository<Job, Integer> {
    Job findById(int id);
}
