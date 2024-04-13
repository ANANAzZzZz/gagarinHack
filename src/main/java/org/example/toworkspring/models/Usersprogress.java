package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "usersprogress", schema = "public")
public class Usersprogress {
    @EmbeddedId
    private UsersprogressId id;

    @MapsId("iduser")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iduser", nullable = false)
    private AppUser iduser;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "idtrack", referencedColumnName = "idtrack", nullable = false),
            @JoinColumn(name = "numbermoduleintrack", referencedColumnName = "numberintrack", nullable = false)
    })
    private Module module;

    @NotNull
    @Column(name = "numberlastcompletepage", nullable = false)
    public Integer numberlastcompletepage;

    @NotNull
    @Column(name = "allquantitypage", nullable = false)
    private Integer allquantitypage;


    public Usersprogress(AppUser appUser, Module module, Integer numberLastCompletePage, Integer allQuantityPage) {
        this.iduser = appUser;
        this.module = module;
        this.numberlastcompletepage = numberLastCompletePage;
        this.allquantitypage = allQuantityPage;
    }

    public Usersprogress() {
        this(new AppUser(), new Module(), 0, 0);
    }
}