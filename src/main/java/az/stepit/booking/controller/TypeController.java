package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Type;
import az.stepit.booking.service.impl.TypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    TypeServiceImpl typeService;

    @PostMapping
    Type save(@RequestBody Type advertisement) {
        return typeService.save(advertisement);
    }

    @PutMapping
    Type update(@RequestBody Type advertisement) {
        return typeService.update(advertisement);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        typeService.delete(id);
    }

    @GetMapping("{id}")
    Type getById(@PathVariable Long id) {
        return typeService.getById(id);
    }

    @GetMapping
    public List<Type> findAll() {
        return typeService.findAll();
    }

}
