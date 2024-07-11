package org.example.section4.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void whenCheckingUserIsActive_thenCorrect() {
        UserService userService = spy(new UserService());

        // Assuming User class has an isActive method returning a boolean
        User mockUser = mock(User.class);
        when(mockUser.isActive()).thenReturn(true);

        // Use the real method but mock the database call
        doReturn(mockUser).when(userService).findUserById(anyString());

        assertTrue(userService.userIsActive("w343"));
    }
}
