package org.example.toworkspring.services

import lombok.RequiredArgsConstructor
import org.example.toworkspring.models.Module
import org.example.toworkspring.models.Track
import org.example.toworkspring.repositories.ModuleRepository
import org.example.toworkspring.repositories.TrackRepository
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class TrackService(private val trackRepository: TrackRepository, private val moduleRepository: ModuleRepository) {

    fun getAllTracks(page: Int, pageSize: Int): MutableIterable<Track> {
        return trackRepository.findAll()
    }

    fun getModulesForTrack(idTrack: Int): List<Module> {
        return moduleRepository.getModulesByIdtrack_IdEquals(idTrack.toLong())
    }
}