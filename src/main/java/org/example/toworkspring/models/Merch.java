package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "merch", schema = "public")
public class Merch {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cost")
    private Integer cost;

}