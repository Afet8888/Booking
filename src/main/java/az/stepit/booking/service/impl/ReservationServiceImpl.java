package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Reservation;
import az.stepit.booking.dao.repository.ReservationRepository;
import az.stepit.booking.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    @Override
    public Reservation save(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation update(Reservation reservation) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Reservation getById(Long id) {
        return null;
    }

    @Override
    public List<Reservation> findAll() {
        return null;
    }

    @Autowired

    public void setReservationRepository(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
}
