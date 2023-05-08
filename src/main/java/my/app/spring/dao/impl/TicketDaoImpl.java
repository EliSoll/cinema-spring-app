package my.app.spring.dao.impl;

import my.app.spring.dao.AbstractDao;
import my.app.spring.dao.TicketDao;
import my.app.spring.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
