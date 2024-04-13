package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PageId implements Serializable {
    private static final long serialVersionUID = -1109627043618567750L;
    @NotNull
    @Column(name = "idtrack", nullable = false)
    private Integer idtrack;

    @NotNull
    @Column(name = "numbermoduleintrack", nullable = false)
    private Integer numbermoduleintrack;

    @NotNull
    @Column(name = "numberinmodule", nullable = false)
    private Integer numberinmodule;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PageId entity = (PageId) o;
        return Objects.equals(this.numbermoduleintrack, entity.numbermoduleintrack) &&
                Objects.equals(this.idtrack, entity.idtrack) &&
                Objects.equals(this.numberinmodule, entity.numberinmodule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbermoduleintrack, idtrack, numberinmodule);
    }

}