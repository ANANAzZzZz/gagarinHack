package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "achievement", schema = "public")
public class Achievement {
    @Id
    @Column(name = "id", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "idtrack", nullable = false),
            @JoinColumn(name = "numberintrack", nullable = false)
    })
    private Module module;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String name;
}