package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
