package org.example.toworkspring.repositories;

import org.example.toworkspring.models.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
}
