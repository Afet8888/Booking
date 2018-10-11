package az.stepit.booking.controller;

import az.stepit.booking.service.RoomService;
import az.stepit.booking.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    RoomServiceImpl roomService;


}
