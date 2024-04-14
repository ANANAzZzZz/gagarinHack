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
@Table(name = "sureveyitem", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
    @Type(type = "org.hibernate.type.TextType")
    private String question;

    @NotNull
    @Lob
    @Column(name = "hint", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String hint;

}