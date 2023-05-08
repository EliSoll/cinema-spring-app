package my.app.spring.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import my.app.spring.model.Role;
import my.app.spring.model.User;
import my.app.spring.service.RoleService;
import my.app.spring.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@i.ua");
        user.setPassword("admin123");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
        User userTwo = new User();
        userTwo.setEmail("user@i.ua");
        userTwo.setPassword("user123");
        userTwo.setRoles(Set.of(userRole));
        userService.add(userTwo);
    }
}
