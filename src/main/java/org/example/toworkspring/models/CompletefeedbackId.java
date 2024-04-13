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
public class CompletefeedbackId implements Serializable {
    private static final long serialVersionUID = 5176900067464514051L;
    @NotNull
    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @NotNull
    @Column(name = "idfeedback", nullable = false)
    private Integer idfeedback;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CompletefeedbackId entity = (CompletefeedbackId) o;
        return Objects.equals(this.idfeedback, entity.idfeedback) &&
                Objects.equals(this.iduser, entity.iduser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idfeedback, iduser);
    }

}