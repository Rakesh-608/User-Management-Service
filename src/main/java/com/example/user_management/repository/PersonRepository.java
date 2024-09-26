package com.example.user_management.repository;

import com.example.user_management.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByEmail(String email);
    Person findByPhone(String phone);
    Person findByEmailAndPassword(String email, String password);
    Person findByPhoneAndPassword(String email, String name);
    Person findByEmailAndPhone(String email, String phone);

}
