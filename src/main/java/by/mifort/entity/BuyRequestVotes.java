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

public class BuyRequestVotes {
    @Id
    private Integer id;
    private Integer buyRequestId;
    private Integer userId;
    private boolean want;

    public BuyRequestVotes(BuyRequestVotes buyRequestVotes) {
        this.id = buyRequestVotes.getId();
        this.buyRequestId = buyRequestVotes.getBuyRequestId();
        this.userId = buyRequestVotes.getUserId();
        this.want = buyRequestVotes.isWant();
    }
}
