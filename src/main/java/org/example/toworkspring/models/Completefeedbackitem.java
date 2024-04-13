package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "completefeedbackitem", schema = "public")
public class Completefeedbackitem {
    @EmbeddedId
    private CompletefeedbackitemId id;

    @MapsId("idfeedback")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idfeedback", nullable = false)
    private Completefeedback idfeedback;

    @Lob
    @Column(name = "answer")
    private String answer;

    @Lob
    @Column(name = "question")
    private String question;

}