package org.example.toworkspring.repositories;

import org.example.toworkspring.models.Achievement;
import org.example.toworkspring.models.Merch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface MerchRepository extends CrudRepository<Merch, Long> {
}
