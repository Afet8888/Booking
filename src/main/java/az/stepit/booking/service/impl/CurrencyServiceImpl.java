package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Currency;
import az.stepit.booking.dao.repository.CurrencyRepository;
import az.stepit.booking.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    private CurrencyRepository currencyRepository;

    @Override
    public Currency save(Currency currency) {
        return null;
    }

    @Override
    public Currency update(Currency currency) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Currency getById(Long id) {
        return null;
    }

    @Override
    public List<Currency> findAll() {
        return null;
    }

    @Autowired

    public void setCurrencyRepository(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }
}
