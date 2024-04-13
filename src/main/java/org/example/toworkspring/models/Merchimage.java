package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "merchimage", schema = "public")
public class Merchimage {
    @EmbeddedId
    private MerchimageId id;

    @MapsId("idmerch")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idmerch", nullable = false)
    private Merch idmerch;

    @MapsId("idimage")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idimage", nullable = false)
    private Image idimage;

}