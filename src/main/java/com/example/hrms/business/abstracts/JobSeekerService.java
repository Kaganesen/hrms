package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobSeeker;
import com.example.hrms.entities.requests.jobseekerRequests.CreateJobSeekerRequest;

import java.util.List;

public interface JobSeekerService {

    Result add(CreateJobSeekerRequest createJobSeekerRequest)throws Exception;
    DataResult<List<JobSeeker>> getAll();

}
