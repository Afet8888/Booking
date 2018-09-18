package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Advertisment;
import az.stepit.booking.dao.dto.Type;
import org.springframework.data.repository.CrudRepository;

public interface TypeRepository extends CrudRepository<Type, Long> {
}
