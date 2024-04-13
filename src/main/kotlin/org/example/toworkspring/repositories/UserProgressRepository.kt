package org.example.toworkspring.repositories

import org.example.toworkspring.models.Usersprogress
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface UserProgressRepository: CrudRepository<Usersprogress, Long>{

    @Query("select p from Usersprogress p where p.id.iduser = ?1 and p.id.idtrack = ?2 and p.id.numbermoduleintrack = ?3")
    fun findProgress(idUser: Int, idTrack: Int, numberModule: Int): Usersprogress?
}