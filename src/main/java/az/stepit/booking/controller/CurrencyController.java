package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.Currency;
import az.stepit.booking.service.impl.CurrencyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    CurrencyServiceImpl currencyService;


    @PostMapping
    Currency save(@RequestBody Currency advertisement) {
        return currencyService.save(advertisement);
    }

    @PutMapping
    Currency update(@RequestBody Currency advertisement) {
        return currencyService.update(advertisement);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        currencyService.delete(id);
    }

    @GetMapping("{id}")
    Currency getById(@PathVariable Long id) {
        return currencyService.getById(id);
    }

    @GetMapping
    public List<Currency> findAll() {
        return currencyService.findAll();
    }

}
