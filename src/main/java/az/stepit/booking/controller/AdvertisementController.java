package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.AdvertisementService;
import az.stepit.booking.service.impl.AdvertisementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static az.stepit.booking.constant.ServiceNames.ADVERTISEMENT;

@RestController
@RequestMapping("/advertisement")
public class AdvertisementController {

    @Autowired
    AdvertisementServiceImpl advertisementService;

    @PostMapping
    Advertisement save(@RequestBody Advertisement advertisement) {
        return advertisementService.save(advertisement);
    }

    @PutMapping
    Advertisement update(@RequestBody Advertisement advertisement) {
        return advertisementService.update(advertisement);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        advertisementService.delete(id);
    }

    @GetMapping("{id}")
    Advertisement getById(@PathVariable Long id) {
        return advertisementService.getById(id);
    }

    @GetMapping
    public List<Advertisement> findAll() {
        return advertisementService.findAll();
    }

}
