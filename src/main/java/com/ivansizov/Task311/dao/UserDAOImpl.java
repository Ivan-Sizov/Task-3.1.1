package com.ivansizov.Task311.dao;


import com.ivansizov.Task311.models.User;

import java.util.List;

public interface UserDAOImpl {
    User getUser(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> getAllUsers();
}
