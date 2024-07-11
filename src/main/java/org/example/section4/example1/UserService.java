package org.example.section4.example1;

public class UserService {
    public User findUserById(String userId) {
        // Database access which we want to avoid in the unit test
        return new User();
    }

    public boolean userIsActive(String userId) {
        User user = findUserById(userId);
        return user.isActive();
    }
}