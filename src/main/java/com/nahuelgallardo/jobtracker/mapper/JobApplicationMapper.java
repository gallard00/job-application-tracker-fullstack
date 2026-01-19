package com.nahuelgallardo.jobtracker.mapper;

import com.nahuelgallardo.jobtracker.dto.request.JobApplicationCreateRequest;
import com.nahuelgallardo.jobtracker.dto.response.JobApplicationResponse;
import com.nahuelgallardo.jobtracker.entity.JobApplication;

public class JobApplicationMapper {

    private JobApplicationMapper() {
    }

    public static JobApplication toEntity(JobApplicationCreateRequest req) {
        return JobApplication.builder()
                .company(req.getCompany())
                .position(req.getPosition())
                .status(req.getStatus())
                .appliedDate(req.getAppliedDate())
                .notes(req.getNotes())
                .build();
    }

    public static JobApplicationResponse toResponse(JobApplication entity) {
        return JobApplicationResponse.builder()
                .id(entity.getId())
                .company(entity.getCompany())
                .position(entity.getPosition())
                .status(entity.getStatus())
                .appliedDate(entity.getAppliedDate())
                .notes(entity.getNotes())
                .build();
    }
}
