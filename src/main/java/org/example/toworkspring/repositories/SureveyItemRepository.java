package org.example.toworkspring.repositories;

import org.example.toworkspring.models.Sureveyitem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface SureveyItemRepository extends CrudRepository<Sureveyitem, Long> {
    @Query("select s from Sureveyitem s where s.id.idsurvey = ?1")
    public ArrayList<Sureveyitem> findAllByIdEquals(Integer idsurvey);
}
