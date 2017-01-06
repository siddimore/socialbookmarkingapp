package com.smore.managers;

import com.smore.dao.UserDao;
import com.smore.entities.User;

/**
 * Created by siddharthmore on 1/4/17.
 */
public class UserManager {

    private static UserManager instance = new UserManager();
    private static UserDao dao = new UserDao();

    private UserManager() {

    }

    public static UserManager getInstance() {

        if(instance != null) {
        return instance;
        }
        else {
            return new UserManager();
        }
    }


    public User createUser(long id, String username, String password, String firstName, String lastName, String userType) {
        User user = new User();

        user.setId(id);
        user.setUsername(username);
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserType(userType);
        return user;
    }

    public User[] getUsers() {
        return dao.getUsers();
    }
}
