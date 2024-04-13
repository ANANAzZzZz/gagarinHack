package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "userdiscount", schema = "public")
public class Userdiscount {
    @EmbeddedId
    private UserdiscountId id;
}