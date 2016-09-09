package hello.dao.user;

import hello.model.User;
import hello.service.user.UserService;
import lombok.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by huangbin on 2016/9/6.
 */

public class UserDaoImpl implements UserDao {



    public User save(User user) {
        System.out.println("save用户信息------------------" + this.getClass().getCanonicalName());
        return user;
    }

    public boolean delete(User user) {
        System.out.println("delete用户信息------------------" + this.getClass().getCanonicalName());
        return false;
    }

    public List<User> findAll() {
        System.out.println("findAll用户信息------------------" + this.getClass().getCanonicalName());
        return null;
    }
}
