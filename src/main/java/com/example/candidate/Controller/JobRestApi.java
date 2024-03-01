package com.example.candidate.Controller;

import com.example.candidate.Entity.Job;
import com.example.candidate.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class JobRestApi {
    private String title ="hello , i'm candidat microservice";
    @Autowired
    private JobService jobService;
    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        return new ResponseEntity<>(jobService.addCandidat(job), HttpStatus.OK);
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Job> updateJob(@PathVariable(value = "id") int id,
                                              @RequestBody Job job){
        return new ResponseEntity<>(jobService.updateCandidat(id, job),
                HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteJob(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(jobService.deleteCandidat(id), HttpStatus.OK);
    }
    @RequestMapping("/hello")
    private String sayHello (){
        System.out.println(title);
        return title;
    }
}
