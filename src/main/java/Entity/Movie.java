package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Movie extends BaseEntity {
    @Id @GeneratedValue
    @Column
    private Long id;

    private String movieName;

    private LocalDateTime openDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIRECTOR_ID")
    private Director director;

    @OneToMany(mappedBy = "movie")
    private List<MovieActor> movieActors = new ArrayList<>();

//    public void setActor(Entity.Actor actor) {
//        this.actors.add(actor);
//        actor.setMovie(this);
//    }

    @OneToMany(mappedBy = "movie")
    private List<Screening> screenings = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private Genre genre;

    private int runningTime;
}
