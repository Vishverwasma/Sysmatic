package com.app.HabitTracker.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.HabitTracker.Model.User;
import com.app.HabitTracker.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.login(user);
    }
}
