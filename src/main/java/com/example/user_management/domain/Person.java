package com.example.user_management.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Document(collection = "users")
public class Person {

    @Id
    private String id;
    private String name;
    private String role;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String gender;
    private int age;
    private String emergencyContact;

    @CreatedDate
    @Field("registeredDate")
    private LocalDateTime registeredDate;

}
