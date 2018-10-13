package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.service.impl.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelServiceImpl hotelService;


    @PostMapping
    Hotel save(@RequestBody Hotel advertisement) {
        return hotelService.save(advertisement);
    }

    @PutMapping
    Hotel update(@RequestBody Hotel advertisement) {
        return hotelService.update(advertisement);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        hotelService.delete(id);
    }

    @GetMapping("{id}")
    Hotel getById(@PathVariable Long id) {
        return hotelService.getById(id);
    }

    @GetMapping
    public List<Hotel> findAll() {
        return hotelService.findAll();
    }

}
