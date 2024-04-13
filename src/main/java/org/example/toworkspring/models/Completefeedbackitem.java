package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "completefeedbackitem", schema = "public")
public class Completefeedbackitem {
    @EmbeddedId
    private CompletefeedbackitemId id;

//    @MapsId("idfeedback")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "iduser", nullable = false, updatable = false, insertable = false),
            @JoinColumn(name = "idfeedback", nullable = false, updatable = false, insertable = false)
    })
    private Completefeedback idfeedback;

    @Lob
    @Column(name = "answer")
    private String answer;

    @Lob
    @Column(name = "question")
    private String question;

}