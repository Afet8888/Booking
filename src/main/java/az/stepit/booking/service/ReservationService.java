package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation save (Reservation reservation);
    Reservation update (Reservation reservation);
    void delete(Long id);
    Reservation getById(Long id);
    List<Reservation> findAll();
}
