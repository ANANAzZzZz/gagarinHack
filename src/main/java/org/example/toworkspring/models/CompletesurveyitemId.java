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
public class CompletesurveyitemId implements Serializable {
    private static final long serialVersionUID = 1307692905560853347L;
    @NotNull
    @Column(name = "idsurvey", nullable = false)
    private Integer idsurvey;

    @NotNull
    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @NotNull
    @Column(name = "ord", nullable = false)
    private Integer ord;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CompletesurveyitemId entity = (CompletesurveyitemId) o;
        return Objects.equals(this.ord, entity.ord) &&
                Objects.equals(this.iduser, entity.iduser) &&
                Objects.equals(this.idsurvey, entity.idsurvey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ord, iduser, idsurvey);
    }

}