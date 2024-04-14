package org.example.toworkspring.repositories;

import org.example.toworkspring.models.Feedbackitem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface FeedbackItemRepository extends CrudRepository<Feedbackitem, Long> {
    @Query("select s from Feedbackitem s where s.id.idsurvey = ?1")
    public ArrayList<Feedbackitem> findAllByIdEquals(Integer idfeedback);
}

