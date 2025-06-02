package me.oj.cinematic.repository;

import me.oj.cinematic.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {}
