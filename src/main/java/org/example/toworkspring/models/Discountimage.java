package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "discountimage", schema = "public")
public class Discountimage {
    @EmbeddedId
    private DiscountimageId id;

    @MapsId("iddiscount")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iddiscount", nullable = false)
    private Discount iddiscount;

    @MapsId("idimage")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idimage", nullable = false)
    private Image idimage;

}