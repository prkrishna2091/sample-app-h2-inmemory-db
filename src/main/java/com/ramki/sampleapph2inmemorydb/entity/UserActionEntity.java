package com.ramki.sampleapph2inmemorydb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "USER_ACTION")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserActionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "action")
    private String action;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "user_id")
    private Long userId;


    @Column(name = "action_date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate actionDate;
}
