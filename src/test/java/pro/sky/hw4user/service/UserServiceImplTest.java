package pro.sky.hw4user.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.hw4user.User;
import pro.sky.hw4user.dao.UserDaoImpl;

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

    @Mock
    private User user;

    @Test
    public void isBackTrueCheckUserExist() {
        User user1 = new User("Mary");
        when(userDaoMock.findAllUsers().contains(user1)).thenReturn(true);
        assertEquals(true, out.checkUserExist(user1));
    }

    @Test
    public void isBackFalsCheckUserExist() {
        User user1 = new User("Mary");
        when(userDaoMock.findAllUsers().contains(user1)).thenReturn(false);
        assertNotEquals(false, out.checkUserExist(user1));
    }
}

