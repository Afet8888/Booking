package az.stepit.booking.controller;

import az.stepit.booking.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stars")
public class StarController {

    private StarService starService;



    @Autowired
    public void setStarService(StarService starService) {
        this.starService = starService;
    }
}
