package com.ramki.sampleapph2inmemorydb.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserActionDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("action")
    private String action;
    @JsonProperty("description")
    private String description;
    @JsonProperty("status")
    private String status;
    @JsonProperty("userId")
    private Long userId;
    @JsonProperty("actionDate")
    @JsonFormat( pattern = "dd/MM/yyyy")
    private LocalDate actionDate;
}
