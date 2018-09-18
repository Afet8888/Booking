package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}
