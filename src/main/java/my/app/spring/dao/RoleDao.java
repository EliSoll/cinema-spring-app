package my.app.spring.dao;

import java.util.Optional;
import my.app.spring.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
