package my.app.spring.service;

import java.util.List;
import my.app.spring.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
