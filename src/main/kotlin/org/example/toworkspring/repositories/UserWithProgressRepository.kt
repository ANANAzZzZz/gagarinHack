package org.example.toworkspring.repositories

import org.example.toworkspring.models.UserWithProgress
import org.springframework.data.repository.CrudRepository

interface UserWithProgressRepository : CrudRepository<UserWithProgress, Long>