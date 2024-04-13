package org.example.toworkspring.services

import lombok.RequiredArgsConstructor
import org.example.toworkspring.models.Track
import org.example.toworkspring.repositories.TrackRepository
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class TrackService(private val trackRepository: TrackRepository) {

    fun getAllTracks(page: Int, pageSize: Int): MutableIterable<Track> {
        trackRepository.save(Track(1, "2", 3))
        return trackRepository.findAll()
    }
}