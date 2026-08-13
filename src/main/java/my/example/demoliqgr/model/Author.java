package my.example.demoliqgr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "author")
public class Author {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Integer yearOfBirth;
    private Integer age;
    private Boolean isAlive;
    public String city;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
