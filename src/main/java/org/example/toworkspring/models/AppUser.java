package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "appuser", schema = "public")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Lob
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotNull
    @Lob
    @Column(name = "hashpassword", nullable = false)
    private String hashpassword;

    public AppUser(){
        this.id = 0;
        this.name = "";
        this.lastName = "";
        this.hashpassword = "";
    }
}