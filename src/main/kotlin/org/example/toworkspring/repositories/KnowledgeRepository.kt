package org.example.toworkspring.repositories

import org.example.toworkspring.models.Knowledge
import org.springframework.data.repository.CrudRepository

interface KnowledgeRepository : CrudRepository<Knowledge, Long>