package my.app.spring.service;

import my.app.spring.model.MovieSession;
import my.app.spring.model.ShoppingCart;
import my.app.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
