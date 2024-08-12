package com.app.HabitTracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.HabitTracker.Model.Habit;
import com.app.HabitTracker.Model.HabitTracking;
import com.app.HabitTracker.Repository.HabitRepository;
import com.app.HabitTracker.Repository.HabitTrackingRepository;

import java.util.Date;
import java.util.List;

@Service
public class HabitTrackingService {

    @Autowired
    private HabitTrackingRepository habitTrackingRepository;

    @Autowired
    private HabitRepository habitRepository;

    public String trackHabit(HabitTracking tracking) {
        Habit habit = habitRepository.findById(tracking.getHabit().getId()).orElse(null);
        if (habit == null) {
            return "Habit not found!";
        }

        habitTrackingRepository.save(tracking);
        return "Habit tracked successfully!";
    }
    public List<HabitTracking> getTracking(int habitId) {
        return habitTrackingRepository.findByHabitId(habitId);
    }
    public List<HabitTracking> getTrackingByDate(int habitId, Date date) {
        return habitTrackingRepository.findByHabitIdAndTrackDate(habitId, date);
    }
}

