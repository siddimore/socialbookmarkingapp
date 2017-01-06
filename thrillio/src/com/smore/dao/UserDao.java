package com.smore.dao;

import com.smore.DataStore;
import com.smore.entities.User;

/**
 * Created by siddharthmore on 1/5/17.
 */
public class UserDao {
    public User[] getUsers() {
        return DataStore.getUsers();
    }
}
