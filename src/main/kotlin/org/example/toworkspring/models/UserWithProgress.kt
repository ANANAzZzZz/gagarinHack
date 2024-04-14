package org.example.toworkspring.models

import org.hibernate.annotations.Type
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "userwithprogress")
open class UserWithProgress(
    @Id
    @Type(type = "org.hibernate.type.IntegerType")
    val id: Int,
    @Type(type = "org.hibernate.type.TextType")
    val name: String,
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "last_name", nullable = false)
    val lastName: String,
    @Type(type = "org.hibernate.type.IntegerType")
    val progress: Int
) {
    constructor() : this(id = 0, name = "", lastName = "", progress = 0)
}