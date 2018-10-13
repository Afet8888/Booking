package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Room;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.RoomMapper;
import az.stepit.booking.dao.repository.RoomRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static az.stepit.booking.constant.ServiceNames.ROOM;

@Service (ROOM)
public class RoomServiceImpl implements AbstractService<Room,Long> {

    @Autowired
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

    @Override
    public List<Room> findAll(SearchDTO searchDTO) {
        return null;
    }


}
