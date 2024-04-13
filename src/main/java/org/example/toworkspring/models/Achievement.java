package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "achievement", schema = "public")
public class Achievement {
    @Id
    @Column(name = "id", nullable = false)
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
    private String name;

}