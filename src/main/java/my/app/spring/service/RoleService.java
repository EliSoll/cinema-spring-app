package my.app.spring.service;

import my.app.spring.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
