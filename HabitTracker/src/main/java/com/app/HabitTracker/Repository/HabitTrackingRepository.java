package com.app.HabitTracker.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.HabitTracker.Model.HabitTracking;

import java.util.Date;
import java.util.List;

public interface HabitTrackingRepository extends JpaRepository<HabitTracking, Integer> {
    List<HabitTracking> findByHabitId(int habitId);
    List<HabitTracking> findByHabitIdAndTrackDate(int habitId, Date trackDate);
}
