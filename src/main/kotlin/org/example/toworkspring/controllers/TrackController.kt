package org.example.toworkspring.controllers

import org.example.toworkspring.models.Track
import org.example.toworkspring.services.TrackService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.Max
import javax.validation.constraints.Min

@RestController
class TrackController(private val trackService: TrackService) {
    @GetMapping("/getTracks")
    fun getTracks(
        @RequestParam(value = "page", defaultValue = "0") @Min(0) page: Int,
        @RequestParam(value = "pageSize", defaultValue = "20") @Min(0) @Max(50) pageSize: Int
    ): MutableList<Track> {
        return trackService.getAllTracks(page, pageSize).toMutableList()
    }
}
