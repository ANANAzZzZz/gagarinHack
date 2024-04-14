package org.example.toworkspring.repositories

import org.example.toworkspring.models.Page
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface PageRepository: CrudRepository<Page, Long> {
    @Query("select p from Page p where p.id.numbermoduleintrack = ?1 and p.id.idtrack = ?2")
    fun getPages(numberModule: Int, idTrack: Int): List<Page>
}