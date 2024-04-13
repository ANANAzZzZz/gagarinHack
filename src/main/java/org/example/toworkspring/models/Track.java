package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "track", schema = "public")
public class Track {

    public Track(){
        this(0, "", 0);
    }
    public Track(Integer _id, String _name, Integer _quantitymodels){
        id = _id;
        name = _name;
        quantitymodels = _quantitymodels;
    }
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "quantitymodels", nullable = false)
    private Integer quantitymodels;

}