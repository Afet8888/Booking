package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Capacity;
import az.stepit.booking.service.CapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/capacity")
public class CapacityController {

    private CapacityService capacityService;

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

    @Autowired
    public void setCapacityService(CapacityService capacityService) {
        this.capacityService = capacityService;
    }
}
