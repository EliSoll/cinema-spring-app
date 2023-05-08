package my.app.spring.dao.impl;

import my.app.spring.dao.AbstractDao;
import my.app.spring.dao.MovieDao;
import my.app.spring.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
