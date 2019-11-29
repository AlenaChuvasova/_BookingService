package by.mifort.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String role;
    private String name;
    private String photoUrl;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = BookQueue.class,
            mappedBy = "users", cascade = CascadeType.ALL)
    private List<BookQueue> bookQueue;

    public User(User user) {
        this.id = user.getId();
        this.role = user.getRole();
        this.name = user.getName();
        this.photoUrl = user.getPhotoUrl();
    }
}
