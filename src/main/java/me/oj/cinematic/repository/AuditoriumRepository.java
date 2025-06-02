package me.oj.cinematic.repository;

import me.oj.cinematic.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {
}
