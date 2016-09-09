package hello;

import hello.model.User;
import hello.service.user.UserService;

import java.util.Date;

/**
 * Created by huangbin on 2016/9/4 0004.
 */
public class HelloWorld {

    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User(1l, "admin", "password", new Date(), true);
        userService.save(user);
    }
}

