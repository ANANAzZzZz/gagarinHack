package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "sureveyitem", schema = "public")
public class Sureveyitem {
    @EmbeddedId
    private SureveyitemId id;

    @MapsId("idsurvey")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idsurvey", nullable = false)
    private Survey idsurvey;

    @NotNull
    @Lob
    @Column(name = "question", nullable = false)
    private String question;

    @NotNull
    @Lob
    @Column(name = "hint", nullable = false)
    private String hint;

}