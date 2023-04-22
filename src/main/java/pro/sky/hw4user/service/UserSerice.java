package pro.sky.hw4user.service;

import pro.sky.hw4user.User;

import java.util.Collection;

public interface UserSerice {

    boolean checkUserExist(Collection<User> users, User user);
}
