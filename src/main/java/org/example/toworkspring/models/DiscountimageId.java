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
public class DiscountimageId implements Serializable {
    private static final long serialVersionUID = 6970903604210162503L;
    @NotNull
    @Column(name = "iddiscount", nullable = false)
    private Integer iddiscount;

    @NotNull
    @Column(name = "idimage", nullable = false)
    private Integer idimage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DiscountimageId entity = (DiscountimageId) o;
        return Objects.equals(this.idimage, entity.idimage) &&
                Objects.equals(this.iddiscount, entity.iddiscount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idimage, iddiscount);
    }

}