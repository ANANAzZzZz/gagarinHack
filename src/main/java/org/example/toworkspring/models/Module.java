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
@Table(name = "module", schema = "public")

//@NamedQueries({
//        @NamedQuery(name = "Module.findDistinctById_Idtrack", query = "select distinct m from  m where m.id.idtrack = :idtrack")
//})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Module {
    @EmbeddedId
    private ModuleId id;

    @MapsId("idtrack")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idtrack", nullable = false)
    private Track idtrack;

    @NotNull
    @Column(name = "quantitypages", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    public Integer quantitypages;

    @NotNull
    @Column(name = "quantitycoins", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer quantitycoins;

    @NotNull
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "startcontent", nullable = false)
    private String startcontent;

    @NotNull
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "endcontent", nullable = false)
    private String endcontent;

    @NotNull
    @Lob
    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "idtrack_id", nullable = false)
    private Integer idTrackId;

    public Module() {
        this.endcontent = "";
        this.name = "";
        this.id = new ModuleId();
        this.startcontent = "";
        this.quantitycoins = 0;
        this.quantitypages = 0;
        this.idtrack = new Track();
    }
}