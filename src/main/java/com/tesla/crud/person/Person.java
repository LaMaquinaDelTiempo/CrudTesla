package com.tesla.crud.person;
import jakarta.persistence.*;
//Esta anotación le indica a JPA que la clase Persona es una entidad.
// Esto significa que será mapeada a una tabla en la base de datos.
// Cada instancia de esta clase representará una fila en la tabla.
@Entity
//Define el nombre de la tabla en la base de datos a la que
// esta entidad está mapeada. En este caso, la tabla se llamará personas.
// Si no colocas esta anotación, JPA por defecto tomará el nombre de la clase
// como nombre de la tabla.
@Table(name = "personas")

public class Person {
    //Esta anotación se coloca antes del campo id para indicar que este atributo será la clave primaria de la tabla.
    // Cada registro en la tabla debe tener un identificador único y este campo será ese identificador.
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY):
    // Indica que el valor del campo id se generará automáticamente por la base de datos.
    // En este caso, estamos usando la estrategia IDENTITY, que le dice a la base de datos
    // que maneje la generación del valor del id (por ejemplo, autoincrementando en MySQL).
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private int age;
    private int dni;
    private String gender;
    private String email;

    public Person() {
    }

    public Person(Long id, String name, String lastName, int age, int dni, String gender, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.gender = gender;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
