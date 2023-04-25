package pro.sky.hw4user.service;

import org.springframework.stereotype.Service;
import pro.sky.hw4user.User;
import pro.sky.hw4user.dao.UserDao;
import pro.sky.hw4user.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {

    private final UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }
}
