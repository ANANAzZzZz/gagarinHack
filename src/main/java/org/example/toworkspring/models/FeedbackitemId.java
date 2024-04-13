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
public class FeedbackitemId implements Serializable {
    private static final long serialVersionUID = -7482009802806445303L;
    @NotNull
    @Column(name = "idsurvey", nullable = false)
    private Integer idsurvey;

    @NotNull
    @Column(name = "ord", nullable = false)
    private Integer ord;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FeedbackitemId entity = (FeedbackitemId) o;
        return Objects.equals(this.ord, entity.ord) &&
                Objects.equals(this.idsurvey, entity.idsurvey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ord, idsurvey);
    }

}