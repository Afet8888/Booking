package az.stepit.booking.controller;

import az.stepit.booking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private RoomService roomService;



    @Autowired
    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }
}
