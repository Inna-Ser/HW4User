package pro.sky.hw4user.dao;

import org.springframework.stereotype.Repository;
import pro.sky.hw4user.User;
import pro.sky.hw4user.exception.UserExistsException;

import java.util.Set;

@Repository
public class UserDaoImpl implements UserDao {

    private User user;

    private final Set<User> users;

    public UserDaoImpl() {
        this.users = Set.of(new User("Mary"), new User("Boris"));
    }

    @Override
    public User addUser(Set<User> users, User user) throws UserExistsException {
        if (user != null) {
            if (!users.contains(user.getName())) {
                users.add(new User());
                return user;
            }
        }
        throw new UserExistsException("пользователь с таким именем уже есть");
    }

    @Override
    public User getUserByName(String name) {
        User user1 = new User(name);
            if (users.contains(user1)) {
                return user1;
            }
        return null;
    }

    @Override
    public Set<User> findAllUsers() {
        return users;
    }
}
