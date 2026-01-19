package com.nahuelgallardo.jobtracker.service;

import com.nahuelgallardo.jobtracker.dto.request.JobApplicationCreateRequest;
import com.nahuelgallardo.jobtracker.dto.response.JobApplicationResponse;
import com.nahuelgallardo.jobtracker.entity.JobApplication;
import com.nahuelgallardo.jobtracker.exception.NotFoundException;
import com.nahuelgallardo.jobtracker.mapper.JobApplicationMapper;
import com.nahuelgallardo.jobtracker.repository.IJobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {
    private final IJobApplicationRepository repository;

    public JobApplicationService(IJobApplicationRepository repository) {
        this.repository = repository;
    }

    public JobApplicationResponse create(JobApplicationCreateRequest request) {
        JobApplication entity = JobApplicationMapper.toEntity(request);
        JobApplication saved = repository.save(entity);
        return JobApplicationMapper.toResponse(saved);
    }

    public List<JobApplicationResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(JobApplicationMapper::toResponse)
                .toList();
    }

    public JobApplicationResponse findById(Long id) {
        JobApplication entity = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("JobApplication not found: " + id));
        return JobApplicationMapper.toResponse(entity);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("JobApplication not found: " + id);
        }
        repository.deleteById(id);
    }
}
