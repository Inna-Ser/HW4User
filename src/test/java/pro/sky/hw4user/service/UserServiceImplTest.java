package pro.sky.hw4user.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.hw4user.User;
import pro.sky.hw4user.dao.UserDaoImpl;

import java.util.Collection;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserDaoImpl userDaoMock;

    @InjectMocks
    private UserServiceImpl out;

    @Test
    public void isBackTrueCheckUserExist() {
        when(userDaoMock.getUserByName("Jack")).thenReturn(new User("Jack"));
        boolean userExist = out.checkUserExist(new User("Jack"));
    }

    @Test
    public void isBackFalseCheckUserExist() {
        when(userDaoMock.getUserByName("Jack")).thenReturn(new User(null));
        boolean userNotExist = out.checkUserExist(new User("Jack"));
    }
}

