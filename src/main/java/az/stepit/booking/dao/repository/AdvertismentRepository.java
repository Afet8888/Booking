package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Advertisment;
import org.springframework.data.repository.CrudRepository;

public interface AdvertismentRepository extends CrudRepository<Advertisment, Long> {
}
