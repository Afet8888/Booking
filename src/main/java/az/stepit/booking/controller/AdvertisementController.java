package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.model.AdvertisementResponse;
import az.stepit.booking.service.impl.AdvertisementServiceImpl;
import az.stepit.booking.service.impl.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advertisement")
//@CrossOrigin(origins = {"http://localhost:63342","http://localhost:8080"})
public class AdvertisementController {

    @Autowired
    AdvertisementServiceImpl advertisementService;

    @Autowired
    BookingService bookingService;

    @PostMapping
    Advertisement save(@RequestBody Advertisement advertisement) {
        return advertisementService.save(advertisement);
    }

    @PostMapping("/getAllAdvertisements")
    AdvertisementResponse getAllByFilter(@RequestBody SearchDTO searchDTO) {
        return bookingService.getAdvertisementAndFilter(searchDTO);
    }

    @PutMapping
    Advertisement update(@RequestBody Advertisement advertisement) {
        return advertisementService.update(advertisement);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        advertisementService.delete(id);
    }

    @GetMapping("/{id}")
    Advertisement getById(@PathVariable Long id) {
        return advertisementService.getById(id);
    }

    @GetMapping
    public List<Advertisement> findAll() {
        return advertisementService.findAll();
    }

}
