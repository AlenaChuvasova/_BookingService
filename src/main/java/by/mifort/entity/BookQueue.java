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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "bookqueue")
public class BookQueue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "bookid")
    private Integer bookId;

    @Column(name = "userid")
    private Integer userId;

    @Column(name = "queue")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer queue;

    @Column(name = "createdat")
    private String createdAt;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "userid",
            updatable = false, insertable = false)
    private User users;

    public BookQueue(BookQueue bookQueue) {
        this.id = bookQueue.getId();
        this.bookId = bookQueue.getBookId();
        this.userId = bookQueue.getUserId();
        this.queue = bookQueue.getQueue();
        this.createdAt = bookQueue.getCreatedAt();
    }
}
