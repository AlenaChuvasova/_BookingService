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

public class UserAccount {
    @Id
    private Integer id;
    private Integer userId;
    private String password;

    public UserAccount(UserAccount userAccount) {
        this.id = userAccount.getId();
        this.userId = userAccount.getUserId();
        this.password = userAccount.getPassword();
    }
}
