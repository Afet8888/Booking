package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Picture;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.PictureService;
import az.stepit.booking.service.impl.PictureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static az.stepit.booking.constant.ServiceNames.PICTURE;

@RestController
@RequestMapping("/pictures")
public class PictureController {

    @Autowired
    PictureServiceImpl pictureService;




}
