package com.nahuelgallardo.jobtracker.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class JobApplicationCreateRequest {
    @NotBlank
    private String company;

    @NotBlank
    private String position;

    @NotBlank
    private String status; // APPLIED, INTERVIEW, OFFER, REJECTED

    private LocalDate appliedDate;

    private String notes;
}
