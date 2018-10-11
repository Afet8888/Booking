package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Reservation;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.ReservationService;
import az.stepit.booking.service.impl.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static az.stepit.booking.constant.ServiceNames.CITY;
import static az.stepit.booking.constant.ServiceNames.RESERVATION;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    ReservationServiceImpl reservationService;


}
