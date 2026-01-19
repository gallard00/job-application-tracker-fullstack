package com.nahuelgallardo.jobtracker.controller;

import com.nahuelgallardo.jobtracker.dto.request.JobApplicationCreateRequest;
import com.nahuelgallardo.jobtracker.dto.response.JobApplicationResponse;
import com.nahuelgallardo.jobtracker.service.JobApplicationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class JobApplicationController {

    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public JobApplicationResponse create(@Valid @RequestBody JobApplicationCreateRequest request) {
        return service.create(request);
    }

    @GetMapping
    public List<JobApplicationResponse> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public JobApplicationResponse findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
