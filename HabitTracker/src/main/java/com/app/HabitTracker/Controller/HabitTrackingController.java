package com.app.HabitTracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.HabitTracker.Model.HabitTracking;
import com.app.HabitTracker.Service.HabitTrackingService;

@RestController
@RequestMapping("/api/tracking")
public class HabitTrackingController {

    @Autowired
    private HabitTrackingService trackingService;

    @PostMapping("/track")
    public String trackHabit(@RequestBody HabitTracking tracking) {
        return trackingService.trackHabit(tracking);
    }

    @GetMapping("/{habitId}")
    public List<HabitTracking> getTracking(@PathVariable int habitId) {
        return trackingService.getTracking(habitId);
    }
}
