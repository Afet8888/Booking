package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Reservation;
import az.stepit.booking.service.impl.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    ReservationServiceImpl reservationService;

    @PostMapping
    Reservation save(@RequestBody Reservation advertisement) {
        return reservationService.save(advertisement);
    }

    @PutMapping
    Reservation update(@RequestBody Reservation advertisement) {
        return reservationService.update(advertisement);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        reservationService.delete(id);
    }

    @GetMapping("{id}")
    Reservation getById(@PathVariable Long id) {
        return reservationService.getById(id);
    }

    @GetMapping
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }
}
