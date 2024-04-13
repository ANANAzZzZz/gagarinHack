package org.example.toworkspring.controllers;

import lombok.RequiredArgsConstructor;
import org.example.toworkspring.models.Achievement;
import org.example.toworkspring.models.Achievementuser;
import org.example.toworkspring.services.AchievementUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AchievementUserController {
    private final AchievementUserService achievementUserService;
    @GetMapping("/user_achievement")
    public List<Achievementuser> getUserAchievement(int id) {
        return achievementUserService.getUserAchievement(id);
    }
}
