package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public class Person extends BaseEntity {

    @Id @GeneratedValue
    @Column
    private Long id;

    private String userName;
    private int dateOfBirth;

    @Embedded
    private Address Address;

//    public Entity.Person(String id, String userName) {this.userName = userName;}

}
