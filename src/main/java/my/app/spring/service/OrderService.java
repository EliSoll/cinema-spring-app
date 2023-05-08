package my.app.spring.service;

import java.util.List;
import my.app.spring.model.Order;
import my.app.spring.model.ShoppingCart;
import my.app.spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
