package org.example.toworkspring.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.toworkspring.models.Achievement;
import org.example.toworkspring.repositories.AchievementRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor
public class AchievementService {
    private final AchievementRepository achievementRepository;
    public ArrayList<Achievement> getAllAchievement() {
        return (ArrayList<Achievement>) achievementRepository.findAll();
    }
}
