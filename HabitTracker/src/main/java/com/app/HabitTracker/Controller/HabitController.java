package com.app.HabitTracker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.HabitTracker.Model.Habit;
import com.app.HabitTracker.Service.HabitService;

import java.util.List;

@RestController
@RequestMapping("/api/habits")
public class HabitController {

    @Autowired
    private HabitService habitService;

    @PostMapping("/add")
    public String addHabit(@RequestBody Habit habit) {
        return habitService.addHabit(habit);
    }

    @GetMapping("/{userId}")
    public List<Habit> getHabits(@PathVariable int userId) {
        return habitService.getHabits(userId);
    }
    @GetMapping("/search")
    public List<Habit> findByExistingColumn(@RequestParam String existingColumn) {
        return habitService.findByExistingColumn(existingColumn);
    }
}

