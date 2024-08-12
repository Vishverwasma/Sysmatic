package com.app.HabitTracker.Model;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "HabitTracking")
public class HabitTracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "habit_id", nullable = false)
    private Habit habit;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date trackDate;

    @Column(nullable = false)
    private boolean status;

    // Constructors, Getters, Setters

    public HabitTracking() {}

    public HabitTracking(Habit habit, Date trackDate, boolean status) {
        this.habit = habit;
        this.trackDate = trackDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Habit getHabit() {
        return habit;
    }

    public void setHabit(Habit habit) {
        this.habit = habit;
    }

    public Date getTrackDate() {
        return trackDate;
    }

    public void setTrackDate(Date trackDate) {
        this.trackDate = trackDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

