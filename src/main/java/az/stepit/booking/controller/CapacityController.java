package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.Capacity;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.CapacityService;
import az.stepit.booking.service.impl.CapacityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static az.stepit.booking.constant.ServiceNames.ADVERTISEMENT;
import static az.stepit.booking.constant.ServiceNames.CAPACITY;

@RestController
@RequestMapping("/capacity")
public class CapacityController {

    @Autowired
    CapacityServiceImpl capacityService;

    @PostMapping
    Capacity save(@RequestBody Capacity capacity) {
        return capacityService.save(capacity);
    }

    @PutMapping
    Capacity update(@RequestBody Capacity capacity) {
        return capacityService.update(capacity);
    }

    @DeleteMapping("{id}")
    void delete (@PathVariable Long id) {
        capacityService.delete(id);
    }

    @GetMapping("{id}")
    Capacity getById (@PathVariable Long id) {
        return capacityService.getById(id);
    }

    @GetMapping
    public List<Capacity> findAll() {
        return capacityService.findAll();
    }

}
