package my.app.spring.dao.impl;

import my.app.spring.dao.AbstractDao;
import my.app.spring.dao.CinemaHallDao;
import my.app.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
