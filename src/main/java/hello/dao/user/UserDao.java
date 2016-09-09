package hello.dao.user;

import hello.model.User;

import java.util.List;

/**
 * Created by huangbin on 2016/9/6.
 */
public interface UserDao {

    /**
     * @param user
     * @return 保存用户
     */
    User save(User user);


    /**
     * @param user
     * @return 删除用户
     */
    boolean delete(User user);




    List<User>  findAll();
}
