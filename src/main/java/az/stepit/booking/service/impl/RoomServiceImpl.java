package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Room;
import az.stepit.booking.dao.repository.RoomRepository;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoomServiceImpl implements AbstractService<Room,Long> {

    private RoomRepository roomRepository;

    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Room getById(Long id) {
        return null;
    }

    @Override
    public List<Room> findAll() {
        return null;
    }

    @Autowired

    public void setRoomRepository(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
}
