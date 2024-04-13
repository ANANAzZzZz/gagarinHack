package org.example.toworkspring.repositories;

import org.example.toworkspring.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long>{
//    AppUser findByEmail(String email);
}
