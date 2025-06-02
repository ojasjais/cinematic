package me.oj.cinematic.repository;

import me.oj.cinematic.model.SeatBooked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatBookedRepository extends JpaRepository<SeatBooked, Long> {
}
