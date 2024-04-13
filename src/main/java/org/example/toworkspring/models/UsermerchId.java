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
public class UsermerchId implements Serializable {
    private static final long serialVersionUID = 2998827251734190017L;
    @NotNull
    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @NotNull
    @Column(name = "idmerch", nullable = false)
    private Integer idmerch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsermerchId entity = (UsermerchId) o;
        return Objects.equals(this.iduser, entity.iduser) &&
                Objects.equals(this.idmerch, entity.idmerch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iduser, idmerch);
    }

}