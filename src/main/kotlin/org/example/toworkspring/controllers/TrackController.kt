package org.example.toworkspring.controllers

import org.example.toworkspring.models.Module
import org.example.toworkspring.models.Page
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
    ): List<Track> {
        return trackService.getAllTracks(page, pageSize).toList()
    }

    @GetMapping("/getModules")
    fun getModulesInTrack(
        @RequestParam(value = "idTrack") idTrack: Int
    ): List<Module> {
        return trackService.getModulesInTrack(idTrack)
    }

    @GetMapping("/getPages")
    fun getPagesInModules(
        @RequestParam(value = "numberModule", defaultValue = "1") numberModule: Int,
        @RequestParam(value = "idTrack", defaultValue = "1") idTrack: Int
    ): List<Page> {
        return trackService.getPagesInModules(numberModule.toLong(), idTrack.toLong())
    }

    @GetMapping("/updateProgress")
    fun updateProgress(
        @RequestParam(value = "idUser") idUser: Int,
        @RequestParam(value = "idTrack") idTrack: Int,
        @RequestParam(value = "numberModule") numberModule: Int,
        @RequestParam(value = "numberPage") numberPage: Int,
    ) {
        trackService.updateProgress(idUser, idTrack, numberModule, numberPage)
    }
}
