package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Theater {
    @Id @GeneratedValue
    @Column
    private Long id;

    private String theaterName;

    private Long floor;

    @OneToMany(mappedBy = "theater")
    private List<Seat> seats = new ArrayList<>();

    @OneToMany(mappedBy = "theater")
    private List<Screening> screenings = new ArrayList<>();
}
