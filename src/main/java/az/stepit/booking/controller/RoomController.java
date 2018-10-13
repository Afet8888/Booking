package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Room;
import az.stepit.booking.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    RoomServiceImpl roomService;

    @PostMapping
    Room save(@RequestBody Room advertisement) {
        return roomService.save(advertisement);
    }

    @PutMapping
    Room update(@RequestBody Room advertisement) {
        return roomService.update(advertisement);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        roomService.delete(id);
    }

    @GetMapping("{id}")
    Room getById(@PathVariable Long id) {
        return roomService.getById(id);
    }

    @GetMapping
    public List<Room> findAll() {
        return roomService.findAll();
    }

}
