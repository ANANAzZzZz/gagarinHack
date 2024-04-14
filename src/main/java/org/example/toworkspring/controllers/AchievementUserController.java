package org.example.toworkspring.controllers;

import lombok.RequiredArgsConstructor;
import org.example.toworkspring.models.Achievementuser;
import org.example.toworkspring.services.AchievementUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AchievementUserController {
    private final AchievementUserService achievementUserService;

    @GetMapping("/user_achievement/{id}")
    public List<Achievementuser> getUserAchievement(@PathVariable("id") int id) {
        return achievementUserService.getUserAchievement(id);
    }
}
