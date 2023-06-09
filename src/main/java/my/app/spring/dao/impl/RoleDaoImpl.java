package my.app.spring.dao.impl;

import java.util.Optional;
import my.app.spring.dao.AbstractDao;
import my.app.spring.dao.RoleDao;
import my.app.spring.exception.DataProcessingException;
import my.app.spring.model.Role;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(String roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> getByRoleName = session.createQuery(
                    "FROM Role WHERE roleName = :roleName", Role.class);
            getByRoleName.setParameter("roleName", Role.RoleName.valueOf(roleName));
            return getByRoleName.uniqueResultOptional();
        } catch (HibernateException e) {
            throw new DataProcessingException("Can't get a role by this name: "
                    + roleName, e);
        }
    }
}
