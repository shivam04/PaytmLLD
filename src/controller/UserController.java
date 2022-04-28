package controller;

import models.User;
import service.UserService;

/**
 * Created by shivam.si on 17/04/22 7:25 pm
 */

public class UserController {
    private UserService userService = new UserService();
    public User registerUser(String phoneNumber, String password) {
        return userService.registerUser(phoneNumber, password);
    }
}
