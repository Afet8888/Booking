package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
