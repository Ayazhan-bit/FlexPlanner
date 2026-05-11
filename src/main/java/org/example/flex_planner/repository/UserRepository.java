package org.example.flex_planner.repository;

import org.example.flex_planner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Этот интерфейс сам создаст методы save(), findAll() и т.д.
}