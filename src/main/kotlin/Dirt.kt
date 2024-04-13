package org.example.toworkspring;

import javax.persistence.*

@Entity
@Table(name = "dirt")
open class Dirt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

}