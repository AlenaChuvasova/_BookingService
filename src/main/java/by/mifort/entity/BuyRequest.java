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

public class BuyRequest {
    @Id
    private Integer id;
    private Integer initiatorId;
    private String description;
    private String status;
    private String resolutionComment;
    private Integer bookId;

    public BuyRequest(BuyRequest buyRequest) {
        this.id = buyRequest.getId();
        this.initiatorId = buyRequest.getInitiatorId();
        this.description = buyRequest.getDescription();
        this.status = buyRequest.getStatus();
        this.resolutionComment = buyRequest.getResolutionComment();
        this.bookId = buyRequest.getBookId();
    }
}
