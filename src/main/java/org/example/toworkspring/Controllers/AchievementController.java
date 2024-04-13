package org.example.toworkspring.Controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AchievementController {
//    private final AchievementService achievementService;
    @GetMapping("/")
    public String achievement() {
//        String temp = achievementService.getAchievement() ? "true" : "false";
        return "temp";
    }

}
