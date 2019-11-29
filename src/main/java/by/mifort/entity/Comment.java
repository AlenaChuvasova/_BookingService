package by.mifort.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Comment {
    @Id
    private Integer id;
    private Integer authorId;
    private String type;
    private String description;
    private Date createdAt;

    public Comment(Comment comment) {
        this.authorId = comment.getAuthorId();
        this.type = comment.getType();
        this.description = comment.getDescription();
        this.createdAt = comment.getCreatedAt();
    }
}
