package my.app.spring.service;

import my.app.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
