package az.stepit.booking.controller;

import az.stepit.booking.service.StarService;
import az.stepit.booking.service.impl.StarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stars")
public class StarController {

    @Autowired
    StarServiceImpl starService;



}
