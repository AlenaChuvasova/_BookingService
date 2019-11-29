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
public class WishlistItem {
    @Id
    private Integer id;
    private Integer userId;
    private Integer bookId;
    private Date createdAt;

    public WishlistItem(WishlistItem wishlistItem) {
        this.id = wishlistItem.getId();
        this.userId = wishlistItem.getUserId();
        this.bookId = wishlistItem.getBookId();
        this.createdAt = wishlistItem.getCreatedAt();
    }
}
