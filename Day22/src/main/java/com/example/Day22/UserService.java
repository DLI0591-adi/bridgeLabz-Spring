package com.example.Day22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.addUser(user);
    }
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    public void updateUserEmail(Long id, String newEmail) {
        userRepository.updateUserEmail(id, newEmail);
    }

    public void addUsers(List<User> users) {
        userRepository.addUsers(users);
    }
    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
