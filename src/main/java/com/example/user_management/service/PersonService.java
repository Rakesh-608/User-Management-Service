package com.example.user_management.service;

import com.example.user_management.domain.Person;
import com.example.user_management.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository userRepository;

    public PersonService(PersonRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Person saveUser(Person person) {
        return userRepository.save(person);
    }

    public Person getUserById(Long id) {
        Optional<Person> optionalPerson = userRepository.findById(id);
        if(optionalPerson.isPresent()){
            return optionalPerson.get();
        }
        throw new RuntimeException("user not found");
    }

    public Person getUserByPhone(String phone) {
        return userRepository.findByPhone(phone);
    }

    public Person getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
