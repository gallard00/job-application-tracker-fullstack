package com.nahuelgallardo.jobtracker.repository;

import com.nahuelgallardo.jobtracker.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
