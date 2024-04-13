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
public class AchievementuserId implements Serializable {
    private static final long serialVersionUID = 3899067397101313222L;
    @NotNull
    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @NotNull
    @Column(name = "idachievement", nullable = false)
    private Integer idachievement;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AchievementuserId entity = (AchievementuserId) o;
        return Objects.equals(this.iduser, entity.iduser) &&
                Objects.equals(this.idachievement, entity.idachievement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iduser, idachievement);
    }

}