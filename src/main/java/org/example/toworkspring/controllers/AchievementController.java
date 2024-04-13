package org.example.toworkspring.controllers;


import lombok.RequiredArgsConstructor;
import org.example.toworkspring.services.AchievementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AchievementController {
    private final AchievementService achievementService;
    @GetMapping("/")
    public String achievement() {
        return achievementService.getAchievement() ? "true" : "false";
    }
}
