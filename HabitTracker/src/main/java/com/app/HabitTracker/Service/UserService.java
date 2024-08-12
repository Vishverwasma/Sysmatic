package com.app.HabitTracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.HabitTracker.Model.User;
import com.app.HabitTracker.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String register(User user) {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return "User already exists!";
        }
        userRepository.save(user);
        return "User registered successfully!";
    }

    public String login(User user) {
        User foundUser = userRepository.findByUsername(user.getUsername());
        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            return "Login successful!";
        }
        return "Invalid username or password!";
    }
}

