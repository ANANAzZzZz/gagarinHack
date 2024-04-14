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
@Table(name = "feedback", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Feedback {
    @Id
    @Column(name = "id", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer id;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String name;

}