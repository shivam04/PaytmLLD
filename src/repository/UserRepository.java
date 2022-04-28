package repository;

import models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivam.si on 17/04/22 7:27 pm
 */

public class UserRepository {
    List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
        System.out.println("User Saved.");
    }
}
