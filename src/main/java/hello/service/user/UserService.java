package hello.service.user;

import hello.dao.user.UserDao;
import hello.dao.user.UserDaoImpl;
import hello.model.User;
import lombok.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2016/9/6.
 */


public class UserService  {
    UserDao userDao = new UserDaoImpl();

    public User save(User user) {

        System.out.println("save用户信息------------------" + this.getClass().getCanonicalName());
        return userDao.save(user);
    }

    public boolean delete(User user) {
        UserDao userDao = new UserDaoImpl();
        System.out.println("delete用户信息------------------" + this.getClass().getCanonicalName());

        return userDao.delete(user);
    }

    public List<User> findAll() {
        UserDao userDao = new UserDaoImpl();
        System.out.println("findAll用户信息------------------" + this.getClass().getCanonicalName());
        return userDao.findAll();
    }


}
