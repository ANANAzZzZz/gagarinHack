package org.example.toworkspring.repositories;

import org.example.toworkspring.models.Survey;
import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<Survey, Long> {
}
