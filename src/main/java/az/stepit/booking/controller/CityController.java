package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.City;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.CityService;
import az.stepit.booking.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static az.stepit.booking.constant.ServiceNames.ADVERTISEMENT;
import static az.stepit.booking.constant.ServiceNames.CITY;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    CityServiceImpl cityService;

    @PostMapping
    City save(@RequestBody City city) {
        return cityService.save(city);
    }

    @PutMapping
    City update(@RequestBody City city) {
        return cityService.update(city);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        cityService.delete(id);
    }

    @GetMapping("{id}")
    City getById(@PathVariable Long id) {
        return cityService.getById(id);
    }

    @GetMapping
    public List<City> findAll() {
        return cityService.findAll();
    }

}
