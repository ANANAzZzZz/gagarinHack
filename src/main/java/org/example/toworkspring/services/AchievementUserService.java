package org.example.toworkspring.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.toworkspring.models.Achievement;
import org.example.toworkspring.models.Achievementuser;
import org.example.toworkspring.repositories.AchievementRepository;
import org.example.toworkspring.repositories.AchievementUserRepository;
import org.example.toworkspring.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AchievementUserService {
    private final UserRepository userRepository;
    private final AchievementUserRepository achievementUserRepository;
    public List<Achievementuser> getUserAchievement(int idUser) {
        return achievementUserRepository.findByIduserEquals(userRepository.getById((long) idUser));
    }
}
