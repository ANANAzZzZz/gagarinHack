package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "page", schema = "public")
public class Page {
    @EmbeddedId
    private PageId id;

//    @MapsId("idtrack")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "idtrack", nullable = false, updatable = false, insertable = false),
            @JoinColumn(name = "numberinmodule", nullable = false, updatable = false, insertable = false)
    })
    private Module idtrack;

    @NotNull
    @Lob
    @Column(name = "content", nullable = false)
    private String content;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    private String name;

}