package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.HotelService;
import az.stepit.booking.service.impl.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static az.stepit.booking.constant.ServiceNames.CITY;
import static az.stepit.booking.constant.ServiceNames.HOTEL;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelServiceImpl hotelService;




}
