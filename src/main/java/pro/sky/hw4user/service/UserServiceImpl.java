package pro.sky.hw4user.service;

import org.springframework.stereotype.Service;
import pro.sky.hw4user.User;
import pro.sky.hw4user.dao.UserDaoImpl;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserSerice {

    private final UserDaoImpl userDao;


    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(Collection<User> users, User user) {
        if (userDao.getUserByName(user.getName()).equals(userDao.findAllUsers().contains(user))) {
            return true;
        }
        return false;
    }
}
