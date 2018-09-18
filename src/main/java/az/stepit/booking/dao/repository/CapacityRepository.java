package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Advertisment;
import az.stepit.booking.dao.dto.Capacity;
import org.springframework.data.repository.CrudRepository;

public interface CapacityRepository extends CrudRepository<Capacity, Long> {
}
