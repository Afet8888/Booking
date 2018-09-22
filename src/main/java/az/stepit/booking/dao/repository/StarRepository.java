package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Star;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarRepository extends CrudRepository<Star, Long> {
}
