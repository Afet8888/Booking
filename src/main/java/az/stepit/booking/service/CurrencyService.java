package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Currency;

import java.util.List;

public interface CurrencyService {

    Currency save (Currency currency);
    Currency update (Currency currency);
    void delete(Long id);
    Currency getById(Long id);
    List<Currency> findAll();
}
