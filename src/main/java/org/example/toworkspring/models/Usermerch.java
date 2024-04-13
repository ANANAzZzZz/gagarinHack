package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "usermerch", schema = "public")
public class Usermerch {
    @EmbeddedId
    private UsermerchId id;

    @MapsId("iduser")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iduser", nullable = false)
    private AppUser iduser;

    @MapsId("idmerch")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idmerch", nullable = false)
    private Merch idmerch;

}