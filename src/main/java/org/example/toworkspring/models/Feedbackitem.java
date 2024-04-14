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
@Table(name = "feedbackitem", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
    @Type(type = "org.hibernate.type.TextType")
    private String question;

    @NotNull
    @Lob
    @Column(name = "hint", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String hint;

}