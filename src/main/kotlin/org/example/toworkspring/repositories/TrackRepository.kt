package org.example.toworkspring.repositories

import org.example.toworkspring.models.Track
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository


interface TrackRepository: CrudRepository<Track, Long> {
}