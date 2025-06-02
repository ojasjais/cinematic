package me.oj.cinematic.repository;

import me.oj.cinematic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
