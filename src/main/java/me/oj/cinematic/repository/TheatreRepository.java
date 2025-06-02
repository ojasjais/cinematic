package me.oj.cinematic.repository;

import me.oj.cinematic.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
