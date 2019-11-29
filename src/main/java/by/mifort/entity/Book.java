package by.mifort.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "title")
    private String title;
    @Column(name = "authors")
    private String authors;
    @Column(name = "description")
    private String description;
    @Column(name = "tags")
    private String tags;
    @Column(name = "status")
    private String status;

    public Book(Book book) {
        this.id = book.getId();
        this.imageUrl = book.getImageUrl();
        this.title = book.getTitle();
        this.authors = book.getAuthors();
        this.description = book.getDescription();
        this.tags = book.getTags();
        this.status = book.getStatus();
    }
}
