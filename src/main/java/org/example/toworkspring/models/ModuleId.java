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
public class ModuleId implements Serializable {
    private static final long serialVersionUID = 7342485325754781693L;

    @NotNull
    @Column(name = "idtrack", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer idtrack;

    @NotNull
    @Column(name = "numberintrack", nullable = false)
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer numberintrack;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ModuleId entity = (ModuleId) o;
        return Objects.equals(this.numberintrack, entity.numberintrack) &&
                Objects.equals(this.idtrack, entity.idtrack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberintrack, idtrack);
    }

}