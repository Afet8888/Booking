package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Reservation;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.ReservationMapper;
import az.stepit.booking.dao.repository.ReservationRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static az.stepit.booking.constant.ServiceNames.RESERVATION;

@Service (RESERVATION)
public class ReservationServiceImpl implements AbstractService<Reservation,Long> {

    @Autowired
    private ReservationRepository reservationRepository;


    @Override
    public Reservation save(Reservation reservation) {

        if (Objects.isNull(reservation)) throw new RuntimeException("Reservation is not entered");
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation update(Reservation reservation) {
        if(Objects.isNull(reservation)) throw new RuntimeException("Reservation  is not entered");
        if (Objects.isNull(reservation.getId()))
            throw new RuntimeException("Bad reservation data");
        if (!reservationRepository.existsById(reservation.getId()))
            throw new RuntimeException("Nothing to update");
        return reservationRepository.save(reservation);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        reservationRepository.deleteById(id);

    }

    @Override
    public Reservation getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Reservation> reservation = reservationRepository.findById(id);
        if (reservation.isPresent())
            return reservation.get();
        throw new RuntimeException("Reservation is not found");
    }

    @Override
    public List<Reservation> findAll() {
        List<Reservation> reservations = (List<Reservation>) reservationRepository.findAll();
        return reservations
                .parallelStream()
                .collect(Collectors.toList());
    }

    @Override
    public List<Reservation> findAll(SearchDTO searchDTO) {
        return null;
    }


}
