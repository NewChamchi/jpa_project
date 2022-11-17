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
public class Seat {
    @Id @GeneratedValue
    @Column
    private Long id;

    private int column;
    private int row;
    private boolean isUsable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEAT_ID")
    private Theater theater;

    @OneToMany(mappedBy = "seat")
    private List<TicketingSeat> ticketingSeat = new ArrayList<>();
}
