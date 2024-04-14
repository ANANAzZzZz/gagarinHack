package org.example.toworkspring.services

import lombok.RequiredArgsConstructor
import org.example.toworkspring.models.UserWithProgress
import org.example.toworkspring.repositories.UserRepository
import org.example.toworkspring.repositories.UserWithProgressRepository
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class RatingService(private val userWithProgressRepository: UserWithProgressRepository) {
    fun getRating() = userWithProgressRepository.findAll().toList()
}