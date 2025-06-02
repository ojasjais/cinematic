package me.oj.cinematic.repository;

import me.oj.cinematic.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
