package org.example.toworkspring.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "appuser", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Type(type = "org.hibernate.type.LongType")
    private Long id;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String name;

    @NotNull
    @Lob
    @Column(name = "last_name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String lastName;

    @NotNull
    @Lob
    @Column(name = "hashpassword", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String hashpassword;

    public AppUser(){
        this.id = 0L;
        this.name = "";
        this.lastName = "";
        this.hashpassword = "";
    }
}