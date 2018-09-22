package az.stepit.booking.controller;

import az.stepit.booking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelService hotelService;



    @Autowired
    public void setHotelService(HotelService hotelService) {
        this.hotelService = hotelService;
    }
}
