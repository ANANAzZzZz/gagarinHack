package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "usermerch", schema = "public")
public class Usermerch {
    @EmbeddedId
    private UsermerchId id;
}