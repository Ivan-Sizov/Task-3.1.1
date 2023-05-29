package com.ivansizov.Task311.service;


import com.ivansizov.Task311.dao.UserDAO;
import com.ivansizov.Task311.models.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserDAO usersDAO;

    @Autowired
    public UserService(UserDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    public List<User> getAllUsers() {
        return usersDAO.getAllUsers();
    }

    public User getUser(int id) {
        return usersDAO.getUser(id);
    }

    public void addUser(User user) {
        usersDAO.addUser(user);
    }

    public void updateUser(User user) {
        usersDAO.updateUser(user);
    }

    public void deleteUser(int id) {
        User user = usersDAO.getUser(id);
        usersDAO.deleteUser(user);
    }
}
