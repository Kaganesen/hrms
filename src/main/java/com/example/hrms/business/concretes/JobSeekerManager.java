package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.concretes.JobSeeker;
import com.example.hrms.entities.requests.jobseekerRequests.CreateJobSeekerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JobSeekerManager implements JobSeekerService {

    private final JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public Result add(CreateJobSeekerRequest createJobSeekerRequest) throws Exception {
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setFirstName(createJobSeekerRequest.getFirstName());
        jobSeeker.setLastName(createJobSeekerRequest.getLastName());
        jobSeeker.setIdentityNumber(createJobSeekerRequest.getIdentityNumber());
        jobSeeker.setBirthDate(createJobSeekerRequest.getBirthDay());
        jobSeeker.setEmail(createJobSeekerRequest.getEmail());
        jobSeeker.setPassword(createJobSeekerRequest.getPassword());
        jobSeeker.setAgainPassword(createJobSeekerRequest.getAgainPassword());


        checkIfExistByEmail(createJobSeekerRequest.getEmail());
        checkIfExistByIdentityNumber(createJobSeekerRequest.getIdentityNumber());
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("Added to data");
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        List<JobSeeker> jobSeekers = this.jobSeekerDao.findAll();
        return new SuccessDataResult<>(jobSeekers, "Listed to data");
    }

    private void checkIfExistByEmail(String email) throws Exception {
        if (this.jobSeekerDao.existsByEmail(email)) {
            throw new Exception("This email is beign used.");
        }
    }

    private void checkIfExistByIdentityNumber(String identityNumber) throws Exception {
        if (this.jobSeekerDao.existsByIdentityNumber(identityNumber)) {
            throw new Exception("This nationality id is beign used.");
        }
    }
}
