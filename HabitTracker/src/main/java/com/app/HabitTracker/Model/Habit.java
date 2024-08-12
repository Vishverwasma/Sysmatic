package com.app.HabitTracker.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Habits")
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String habitName;

    private String name;
    
    private String correctColumnName;

    private String existingColumn;

    private String nonExistentColumn;
    
	public String getNonExistentColumn() {
		return nonExistentColumn;
	}

	public void setNonExistentColumn(String nonExistentColumn) {
		this.nonExistentColumn = nonExistentColumn;
	}

	public String getExistingColumn() {
		return existingColumn;
	}

	public void setExistingColumn(String existingColumn) {
		this.existingColumn = existingColumn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getHabitName() {
		return habitName;
	}

	public void setHabitName(String habitName) {
		this.habitName = habitName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorrectColumnName() {
		return correctColumnName;
	}

	public void setCorrectColumnName(String correctColumnName) {
		this.correctColumnName = correctColumnName;
	}

	public Habit() {
		super();
	}

	public Habit(int id, User user, String habitName, String name, String correctColumnName, String existingColumn, String nonExistentColumn) {
		super();
		this.id = id;
		this.user = user;
		this.habitName = habitName;
		this.name = name;
		this.correctColumnName = correctColumnName;
		this.existingColumn = existingColumn;
		this.nonExistentColumn = nonExistentColumn;
	}
    
    
}
