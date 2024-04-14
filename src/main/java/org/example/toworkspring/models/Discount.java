package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "discount", schema = "public")
public class Discount {
    @Id
    @Column(name = "id", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer id;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String name;

    @NotNull
    @Column(name = "cost", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer cost;

}