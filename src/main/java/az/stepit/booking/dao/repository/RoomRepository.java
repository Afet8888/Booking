package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
