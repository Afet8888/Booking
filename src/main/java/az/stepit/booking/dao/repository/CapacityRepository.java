package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Capacity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapacityRepository extends CrudRepository<Capacity, Long> {
}
