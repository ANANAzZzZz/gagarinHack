package org.example.toworkspring.repositories

import org.example.toworkspring.models.Module
import org.example.toworkspring.models.Track
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface ModuleRepository: CrudRepository<Module, Long>{

    fun getModulesByIdtrack_IdEquals(idtrack: Long): List<Module>
}