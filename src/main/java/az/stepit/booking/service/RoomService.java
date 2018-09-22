package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Room;

import java.util.List;

public interface RoomService {
    Room save (Room room);
    Room update (Room room);
    void delete(Long id);
    Room getById(Long id);
    List<Room> findAll();
}
