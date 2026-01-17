package com.nahuelgallardo.jobtracker.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "job_applications")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;

    private String position;

    private String status; // APPLIED, INTERVIEW, OFFER, REJECTED

    private LocalDate appliedDate;

    private String notes;
}
