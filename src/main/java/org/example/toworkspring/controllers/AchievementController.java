package org.example.toworkspring.controllers;


import lombok.RequiredArgsConstructor;
import org.example.toworkspring.models.Achievement;
import org.example.toworkspring.services.AchievementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class AchievementController {
    private final AchievementService achievementService;
    @GetMapping("/achievements")
    public ArrayList<Achievement> getAllAchievement() {
        return achievementService.getAllAchievement();
    }
}
