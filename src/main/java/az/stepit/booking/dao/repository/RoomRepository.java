package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
