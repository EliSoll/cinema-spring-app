package my.app.spring.dao;

import java.util.List;
import java.util.Optional;
import my.app.spring.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
