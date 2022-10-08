package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository <JobSeeker,Integer>{

    boolean existsByEmail(String email);

    boolean existsByIdentityNumber(String identityNumber);


}
