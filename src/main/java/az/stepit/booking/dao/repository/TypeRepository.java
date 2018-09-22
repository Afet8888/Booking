package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {
}
