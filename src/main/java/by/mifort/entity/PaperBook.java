package by.mifort.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class PaperBook {
    @Id
    private Integer id;
    private Integer bookId;
    private String isbn;
    private String status;

    public PaperBook(PaperBook paperBook) {
        this.id = paperBook.getId();
        this.bookId = paperBook.getBookId();
        this.isbn = paperBook.getIsbn();
        this.status = paperBook.getStatus();
    }
}
