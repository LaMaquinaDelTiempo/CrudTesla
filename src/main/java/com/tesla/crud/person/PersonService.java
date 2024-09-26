package com.tesla.crud.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    public List<Person> getNames() {
        return List.of(
                new Person(
                        123L,
                        "Diego",
                        "Hernandez",
                        36,
                        101010,
                        "M",
                        "diego123@gmail.com"
                )
        );
    }
}
