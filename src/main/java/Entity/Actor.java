package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Actor extends Participants {
    @OneToMany(mappedBy="actor")
    private List<MovieActor> movieActors = new ArrayList<>();

//    public void setMovie(Entity.Movie movie) {
//        this.movies.add(movie);
//        movie.setActors(this);
//    }

    private int height;
    private String agency;

}
