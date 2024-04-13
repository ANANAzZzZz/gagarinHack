package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "achievement")
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "picture", nullable = false)
    private String picture;

    @OneToMany(mappedBy = "idAchievements")
    private Set<Userwithachievement> userwithachievements = new LinkedHashSet<>();

}