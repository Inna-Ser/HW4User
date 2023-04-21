package pro.sky.hw4user.dao;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import pro.sky.hw4user.User;
import pro.sky.hw4user.exception.UserExistsException;
import pro.sky.hw4user.exception.UserNonExistsException;
import pro.sky.hw4user.dao.UserDaoImpl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class UserDaoImplTest {

    static UserDaoImpl userDao;
    static User user;

    @BeforeAll
    public static void unitParam() {
        System.out.println("Start testing");
    }

    @AfterAll
    public static void shouldDoAfterAll() {
        System.out.println("Finish testing");
    }

    @Test
    void addUser() throws UserExistsException {
        Assertions.assertNotEquals(user.getName(), "Jack");
        }

    @Test
    void shouldGetUserByName() {
        User user = new User("Mary");
        Assertions.assertEquals("Mary", user.getName());
    }

    @Test
    void shouldGetNullIfUserIsNot() {
        String name = null;
        Assertions.assertNull(name);
    }
}