package com.example.candidate.Services;

import com.example.candidate.Entity.Job;
import com.example.candidate.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepository candidatRepo;
    public Job addCandidat(Job job){
        return candidatRepo.save(job);
    }

    public Job updateCandidat(int id, Job newJob) {

        if (candidatRepo.findById(id).isPresent()) {
            Job existingJob = candidatRepo.findById(id).get();
            existingJob.setService(newJob.getService());
            existingJob.setEtat(newJob.isEtat());

            return candidatRepo.save(existingJob);
        } else
            return null;
    }
    public Optional<Job> updateJobState(int jobId, boolean available) {
        Optional<Job> optionalJob = candidatRepo.findById(jobId);
        if (optionalJob.isPresent()) {
            Job job = optionalJob.get();
            job.setEtat(Boolean.parseBoolean(available ? "true" : "false"));
            return Optional.of(candidatRepo.save(job));
        } else {
            return Optional.empty();
        }
    }
    public String deleteCandidat(int id) {
        if (candidatRepo.findById(id).isPresent()) {
            candidatRepo.deleteById(id);
            return "job supprimé";
        } else
            return "job non supprimé";
    }
}
