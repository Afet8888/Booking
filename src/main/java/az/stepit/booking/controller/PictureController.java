package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Picture;
import az.stepit.booking.service.impl.PictureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pictures")
public class PictureController {

    @Autowired
    PictureServiceImpl pictureService;


    @PostMapping
    Picture save(@RequestBody Picture advertisement) {
        return pictureService.save(advertisement);
    }

    @PutMapping
    Picture update(@RequestBody Picture advertisement) {
        return pictureService.update(advertisement);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        pictureService.delete(id);
    }

    @GetMapping("{id}")
    Picture getById(@PathVariable Long id) {
        return pictureService.getById(id);
    }

    @GetMapping
    public List<Picture> findAll() {
        return pictureService.findAll();
    }

}
