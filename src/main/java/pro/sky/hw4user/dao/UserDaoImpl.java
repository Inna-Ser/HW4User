package pro.sky.hw4user.dao;

import org.springframework.stereotype.Repository;
import pro.sky.hw4user.User;
import pro.sky.hw4user.exception.UserExistsException;
import pro.sky.hw4user.exception.UserNonExistsException;

import java.util.Collection;
import java.util.Set;

@Repository
public class UserDaoImpl implements UserDao {

    private User user;

    private final Set<User> users;

    public UserDaoImpl() {
        this.users = Set.of(new User("Mary"), new User("Boris"));
    }

    @Override
    public String addUser(String userName) throws UserExistsException {
        if (userName != null || !userName.isEmpty()) {
            if (!users.contains(user.getName())) {
                users.add(new User());
                return "новывй пользователь добавлен";
            }
        }
        throw new UserExistsException("пользователь с таким именем уже есть");
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (users.contains(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public Collection<User> findAllUsers() {
        return users;
    }
}
