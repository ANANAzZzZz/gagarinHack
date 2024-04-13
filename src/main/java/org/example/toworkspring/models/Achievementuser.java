package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "achievementuser", schema = "public")
public class Achievementuser {
    @EmbeddedId
    private AchievementuserId id;

    @MapsId("iduser")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iduser", nullable = false)
    private AppUser iduser;

    @MapsId("idachievement")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idachievement", nullable = false)
    private Achievement idachievement;

}