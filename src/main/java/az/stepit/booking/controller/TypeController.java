package az.stepit.booking.controller;

import az.stepit.booking.service.TypeService;
import az.stepit.booking.service.impl.TypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    TypeServiceImpl typeService;



}
