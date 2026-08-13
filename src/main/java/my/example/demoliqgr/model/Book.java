package my.example.demoliqgr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;
import java.util.stream.Collectors;


@Entity
@Table(name = "book")
public class Book {
    @Id
    private Long id;
    private String title;
    private Short publicationYear;

    @ManyToMany()
    private List<Author> authors;

    @Override
    public String toString() {
        String authorsList = authors.stream()
                .map(Author::toString)
                .collect(Collectors.joining(", "));
        return "Book{ title: " + title + ", authors: " + authorsList+ "}";
    }
}
