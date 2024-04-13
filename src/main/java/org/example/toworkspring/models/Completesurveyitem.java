package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "completesurveyitem", schema = "public")
public class Completesurveyitem {
    @EmbeddedId
    private CompletesurveyitemId id;

//    @MapsId("idsurvey")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "iduser", nullable = false, updatable = false, insertable = false),
            @JoinColumn(name = "idsurvey", nullable = false, updatable = false, insertable = false)
    })    private Compeletesurvey idsurvey;

    @Lob
    @Column(name = "answer")
    private String answer;

    @Lob
    @Column(name = "question")
    private String question;

}