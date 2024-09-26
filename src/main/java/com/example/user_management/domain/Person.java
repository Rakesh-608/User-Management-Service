package com.example.user_management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "users")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String role;
    @Column(unique = true)
    private String email;
    private String password;
    private String phone;
    private String address;
    private String gender;
    private int age;
    private String emergencyContact;

    @CreatedDate
    private LocalDateTime registeredDate;

}
