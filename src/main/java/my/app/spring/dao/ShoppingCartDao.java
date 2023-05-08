package my.app.spring.dao;

import my.app.spring.model.ShoppingCart;
import my.app.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
