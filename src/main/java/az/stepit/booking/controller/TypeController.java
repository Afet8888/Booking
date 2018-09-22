package az.stepit.booking.controller;

import az.stepit.booking.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/types")
public class TypeController {

    private TypeService typeService;



    @Autowired
    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }
}
