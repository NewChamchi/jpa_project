package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Client extends Person {
    private int mileage;

    @OneToMany(mappedBy = "client")
    private List<Ticketing> ticketings = new ArrayList<>();

}
