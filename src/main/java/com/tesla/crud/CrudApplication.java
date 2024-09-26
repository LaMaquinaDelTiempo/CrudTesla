package com.tesla.crud;

import com.tesla.crud.person.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
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
