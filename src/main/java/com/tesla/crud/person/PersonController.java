package com.tesla.crud.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {
    @GetMapping(path="/")
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
