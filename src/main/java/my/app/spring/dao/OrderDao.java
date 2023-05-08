package my.app.spring.dao;

import java.util.List;
import my.app.spring.model.Order;
import my.app.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
