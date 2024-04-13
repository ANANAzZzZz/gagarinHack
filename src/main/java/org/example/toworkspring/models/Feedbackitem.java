package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "feedbackitem", schema = "public")
public class Feedbackitem {
    @EmbeddedId
    private FeedbackitemId id;

    @MapsId("idsurvey")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idsurvey", nullable = false)
    private Feedback idsurvey;

    @NotNull
    @Lob
    @Column(name = "question", nullable = false)
    private String question;

    @NotNull
    @Lob
    @Column(name = "hint", nullable = false)
    private String hint;

}