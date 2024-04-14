package org.example.toworkspring.controllers

import org.example.toworkspring.models.UserWithProgress
import org.example.toworkspring.services.RatingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RatingController(private val ratingService: RatingService) {

    @GetMapping("/rating")
    fun getRating(): List<UserWithProgress> {
        return ratingService.getRating()
    }
}