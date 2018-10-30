package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Star;
import az.stepit.booking.service.impl.StarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stars")
public class StarController {

    @Autowired
    StarServiceImpl starService;

    @PostMapping
    Star save(@RequestBody Star advertisement) {
        return starService.save(advertisement);
    }

    @PutMapping
    Star update(@RequestBody Star advertisement) {
        return starService.update(advertisement);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        starService.delete(id);
    }

    @GetMapping("{id}")
    Star getById(@PathVariable Long id) {
        return starService.getById(id);
    }

    @GetMapping("/findall")
    public List<Star> findAll() {
        return starService.findAll();
    }

}
