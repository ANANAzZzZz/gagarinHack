package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class SureveyitemId implements Serializable {
    private static final long serialVersionUID = -6953788121200088006L;
    @NotNull
    @Column(name = "idsurvey", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer idsurvey;

    @NotNull
    @Column(name = "ord", nullable = false)
    private Integer ord;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SureveyitemId entity = (SureveyitemId) o;
        return Objects.equals(this.ord, entity.ord) &&
                Objects.equals(this.idsurvey, entity.idsurvey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ord, idsurvey);
    }

}