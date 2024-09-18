package com.example.user_management.controller;


import com.example.user_management.domain.Person;
import com.example.user_management.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<?> registerUser(@RequestBody Person person){
        return ResponseEntity.ok(personService.saveUser(person));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(personService.getUserById(id));
    }

    /*
    * 	- GET /api/users/viewDashboard
	- GET /api/users/viewProfile
	- GET /api/users/viewAlerts
	- GET /api/users/viewAccidentReports
	- POST /api/users/postAnIncident
	- POST /api/users/sendAlertToResponders
	- PUT /api/users/updateProfile

    * */

    @GetMapping("/viewDashboard")
    public ResponseEntity<?> viewDashboard(){
        return ResponseEntity.ok("viewDashboard");
    }

    @GetMapping("/viewProfile")
    public ResponseEntity<Person> viewProfile(){
        return ResponseEntity.ok(personService.getUserById(1L));
    }

    @GetMapping("/viewAlerts")
    public ResponseEntity<?> viewAlerts(){
        return ResponseEntity.ok("viewAlerts");
    }

    @GetMapping("/viewAccidentReports")
    public ResponseEntity<?> viewAccidentReports(){
        return ResponseEntity.ok("viewAccidentReports");
    }

    @PostMapping("/postAnIncident")
    public ResponseEntity<?> postAnIncident(){
        return ResponseEntity.ok("postAnIncident");
    }

    @PostMapping("/sendAlertToResponders")
    public ResponseEntity<?> sendAlertToResponders(){
        return ResponseEntity.ok("sendAlertToResponders");
    }

    @PutMapping("/updateProfile")
    public ResponseEntity<?> updateProfile(){
        return ResponseEntity.ok("updateProfile");
    }
}
