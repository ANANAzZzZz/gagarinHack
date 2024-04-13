package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "compeletesurvey", schema = "public")
public class Compeletesurvey {
    @EmbeddedId
    private CompeletesurveyId id;

    @Lob
    @Column(name = "name")
    private String name;

}