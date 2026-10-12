package com.rishi.springprojectjob.service;

import com.rishi.springprojectjob.model.JobPost;
import com.rishi.springprojectjob.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {
    @Autowired
    private JobRepo repository;

    public void addJob(JobPost jobPost){
        repository.addJob(jobPost);//here jobPost is a DTO(Data Transfer Object)
    }

    public List<JobPost> getAllJobs(){
        return repository.getAllJobs();
    }

}
