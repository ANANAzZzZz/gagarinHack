package org.example.toworkspring.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "track")
class Track(
    @Id
    val id: Long = 0,
    val name: String = "",
    val quantityModules: Int = 0
)