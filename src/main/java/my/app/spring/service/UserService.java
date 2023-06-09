package my.app.spring.service;

import java.util.Optional;
import my.app.spring.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
