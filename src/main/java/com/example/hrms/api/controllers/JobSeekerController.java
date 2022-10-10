package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobSeeker;
import com.example.hrms.entities.requests.jobseekerRequests.CreateJobSeekerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")

public class JobSeekerController {
    private final JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }
    @PostMapping("/add")
    public Result add(@RequestBody CreateJobSeekerRequest createJobSeekerRequest) throws Exception {
        return this.jobSeekerService.add(createJobSeekerRequest);
    }
    @GetMapping("/getall")
    public DataResult<List<JobSeeker>> getAll() {
        return this.jobSeekerService.getAll();
    }
}
