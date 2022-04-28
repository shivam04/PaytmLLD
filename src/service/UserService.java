package service;

import models.User;
import repository.UserRepository;

/**
 * Created by shivam.si on 17/04/22 7:26 pm
 */

public class UserService {

    UserRepository userRepository = new UserRepository();

    public User registerUser(String phoneNo, String password) {
        User user = new User();
        user.setPhoneNumber(phoneNo);
        user.setHashedPassword(password);
        userRepository.save(user);
        return user;
    }
}
