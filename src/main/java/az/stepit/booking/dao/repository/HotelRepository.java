package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotel, Long> {
}
