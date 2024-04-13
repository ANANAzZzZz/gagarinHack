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
public class MerchimageId implements Serializable {
    private static final long serialVersionUID = -3033605923450045221L;
    @NotNull
    @Column(name = "idmerch", nullable = false)
    private Integer idmerch;

    @NotNull
    @Column(name = "idimage", nullable = false)
    private Integer idimage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MerchimageId entity = (MerchimageId) o;
        return Objects.equals(this.idmerch, entity.idmerch) &&
                Objects.equals(this.idimage, entity.idimage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmerch, idimage);
    }

}