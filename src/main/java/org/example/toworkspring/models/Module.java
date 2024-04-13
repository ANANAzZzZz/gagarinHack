package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "module", schema = "public")
public class Module {
    @EmbeddedId
    private ModuleId id;

    @MapsId("idtrack")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idtrack", nullable = false)
    private Track idtrack;

    @NotNull
    @Column(name = "quantitypages", nullable = false)
    private Integer quantitypages;

    @NotNull
    @Column(name = "quantitycoins", nullable = false)
    private Integer quantitycoins;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Lob
    @Column(name = "startcontent", nullable = false)
    private String startcontent;

    @NotNull
    @Lob
    @Column(name = "endcontent", nullable = false)
    private String endcontent;

}