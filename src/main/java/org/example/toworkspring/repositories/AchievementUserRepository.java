package org.example.toworkspring.repositories;

import org.example.toworkspring.models.Achievementuser;
import org.example.toworkspring.models.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AchievementUserRepository extends CrudRepository<Achievementuser, Long> {
    List<Achievementuser> findByIduserEquals(AppUser iduser);
}
