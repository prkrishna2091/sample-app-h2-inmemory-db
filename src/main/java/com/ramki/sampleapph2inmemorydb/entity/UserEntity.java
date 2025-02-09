package com.ramki.sampleapph2inmemorydb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOCK_DATA")
public class UserEntity {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;


}