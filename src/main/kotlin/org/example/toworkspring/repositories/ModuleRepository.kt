package org.example.toworkspring.repositories

import org.example.toworkspring.models.Module
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface ModuleRepository : CrudRepository<Module, Long> {

    fun getModulesByIdtrack_IdEquals(idtrack: Long): List<Module>


    @Query("select m from Module m where m.id.idtrack = ?1 and m.id.numberintrack = ?2")
    fun findById_IdtrackAndId_Numberintrack(idtrack: Int, numberintrack: Int): Module
}