package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@MappedSuperclass
@Getter
@Setter
public class Participants {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    private String userName;
    private int dateOfBirth;


}
