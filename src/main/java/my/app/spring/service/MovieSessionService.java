package my.app.spring.service;

import java.time.LocalDate;
import java.util.List;
import my.app.spring.model.MovieSession;

public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession add(MovieSession session);

    MovieSession get(Long id);

    MovieSession update(MovieSession movieSession);

    void delete(Long id);
}
