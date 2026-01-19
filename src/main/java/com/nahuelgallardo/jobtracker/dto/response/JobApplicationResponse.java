package com.nahuelgallardo.jobtracker.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class JobApplicationResponse {
    private Long id;
    private String company;
    private String position;
    private String status;
    private LocalDate appliedDate;
    private String notes;
}
