package com.tesla.crud.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping
    public List<Person> findAll() {
        return personService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Person> findById(@PathVariable Long id) {
        Person persona = personService.findById(id);
        if (persona != null) {
            return new ResponseEntity<>(persona, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public Person create(@RequestBody Person persona) {
        return personService.save(persona);
    }

  @PutMapping("/{id}")
  public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person persona) {
      Person existingPersona = personService.findById(id);
      if (existingPersona != null) {
          existingPersona.setName(persona.getName());
          existingPersona.setLastName(persona.getLastName());
          existingPersona.setAge(persona.getAge());
          existingPersona.setDni(persona.getDni());
          existingPersona.setGender(persona.getGender());
          existingPersona.setEmail(persona.getEmail());
          return new ResponseEntity<>(personService.save(existingPersona), HttpStatus.OK);
      }
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Person persona = personService.findById(id);
        if (persona != null) {
            personService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
