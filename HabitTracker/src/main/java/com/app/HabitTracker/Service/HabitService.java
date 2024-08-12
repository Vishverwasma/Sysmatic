package com.app.HabitTracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.HabitTracker.Model.Habit;
import com.app.HabitTracker.Repository.HabitRepository;

import java.util.List;

@Service
public class HabitService {

    @Autowired
    private HabitRepository habitRepository;

    public String addHabit(Habit habit) {
        habitRepository.save(habit);
        return "Habit added successfully!";
    }

    public List<Habit> getHabits(int userId) {
        return habitRepository.findByUserId(userId);
    }
    

    public List<Habit> findByExistingColumn(String existingColumn) {
        return habitRepository.findByExistingColumn(existingColumn);
    }
}

