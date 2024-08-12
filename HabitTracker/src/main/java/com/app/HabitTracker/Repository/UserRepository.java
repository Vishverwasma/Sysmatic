package com.app.HabitTracker.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.HabitTracker.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
