package me.oj.cinematic.service;

import me.oj.cinematic.model.SeatBooked;

import java.util.List;

public interface SeatBookedService {
    List<SeatBooked> getAllSeatBooked();

    SeatBooked getSeatBookedById(Long seat_booked_id);

    SeatBooked pushSeatBooked(SeatBooked newSeatBooked);

    SeatBooked updateSeatBooked(SeatBooked updatedSeatBooked, Long seat_booked_id);

    void deleteSeatBookedById(Long seat_booked_id);
}
