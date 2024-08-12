package com.app.HabitTracker.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.HabitTracker.Model.Habit;

import java.util.List;

public interface HabitRepository extends JpaRepository<Habit, Integer> {
    List<Habit> findByUserId(int userId);
    List<Habit> findByCorrectColumnName(String value);
 // Example of an incorrect query in a repository method
    List<Habit> findByName(String name);
    List<Habit> findByExistingColumn(String existingColumn);
    @Query("SELECT h FROM Habit h WHERE h.nonExistentColumn = :value") 
    List<Habit> findByNonExistentColumn(@Param("value") String value);
    
}
