package pro.sky.hw4user.dao;

import pro.sky.hw4user.User;
import pro.sky.hw4user.exception.UserExistsException;
import pro.sky.hw4user.exception.UserNonExistsException;

import java.util.Collection;
import java.util.Set;

public interface UserDao {

    User addUser(Set<User> users, User user) throws UserExistsException;

    User getUserByName(String name) throws UserNonExistsException;

    Collection<User> findAllUsers();
}
