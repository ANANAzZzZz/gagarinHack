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
public class CompeletesurveyId implements Serializable {
    private static final long serialVersionUID = 1484703837255654452L;
    @NotNull
    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @NotNull
    @Column(name = "idsurvey", nullable = false)
    private Integer idsurvey;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CompeletesurveyId entity = (CompeletesurveyId) o;
        return Objects.equals(this.iduser, entity.iduser) &&
                Objects.equals(this.idsurvey, entity.idsurvey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iduser, idsurvey);
    }

}