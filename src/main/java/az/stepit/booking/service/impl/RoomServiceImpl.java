package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Room;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.RoomMapper;
import az.stepit.booking.dao.repository.RoomRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static az.stepit.booking.constant.ServiceNames.ROOM;

@Service (ROOM)
public class RoomServiceImpl implements AbstractService<Room,Long> {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomMapper roomMapper;



    @Override
    public Room save(Room room) {
        if (Objects.isNull(room)) throw new RuntimeException("Room is not entered");
        return roomRepository.save(room);
    }

    @Override
    public Room update(Room room) {
        if (Objects.isNull(room)) throw new RuntimeException("Room is not entered");
        if (Objects.isNull(room.getId()))
            throw new RuntimeException("Bad room data");
        if (!roomRepository.existsById(room.getId()))
            throw new RuntimeException("Nothing to update");
        return roomRepository.save(room);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        roomRepository.deleteById(id);

    }

    @Override
    public Room getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Room> room = roomRepository.findById(id);
        if ((room.isPresent()))
        return room.get();
        throw new RuntimeException("Room is not found");
    }

    @Override
    public List<Room> findAll() {
        List<Room> rooms = (List<Room>)  roomMapper.getAllRoom();
        return rooms
                .parallelStream()
                .collect(Collectors.toList());
    }

    @Override
    public List<Room> findAll(SearchDTO searchDTO) {
        return null;
    }


}
