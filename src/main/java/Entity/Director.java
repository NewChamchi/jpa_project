package Entity;

import lombok.AllArgsConstructor;
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
@Entity
public class Director extends Participants {

    @OneToMany(mappedBy="director")
    @JoinColumn(name="MOVIE_ID")
    private List<Movie> movies = new ArrayList<>();

    public void setMovie(Movie movie) {
        this.movies.add(movie);
        movie.setDirector(this);
    }

    private String birthplace;
}
