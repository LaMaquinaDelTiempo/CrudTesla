package com.tesla.crud.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Person> findAll() {
        return personaRepository.findAll();
    }

    public Person save(Person persona) {
        return personaRepository.save(persona);
    }

    public Person findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }
}
