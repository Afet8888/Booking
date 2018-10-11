package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Currency;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.CurrencyService;
import az.stepit.booking.service.impl.CurrencyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static az.stepit.booking.constant.ServiceNames.CITY;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    CurrencyServiceImpl currencyService;




}
