package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "completefeedback", schema = "public")
public class Completefeedback {
    @EmbeddedId
    private CompletefeedbackId id;

    @Lob
    @Column(name = "name")
    private String name;

}