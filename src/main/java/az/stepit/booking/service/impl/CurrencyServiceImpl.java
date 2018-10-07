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
            if (Objects.isNull(currency)) throw new RuntimeException("Currency is not entered");
            if (Objects.isNull(currency.getId()) || Objects.isNull(currency.getName()))
                throw new RuntimeException("Bad currency data");
            return currencyRepository.save(currency);
    }

    @Override
    public Currency update(Currency currency) {
            if (Objects.isNull(currency)) throw new RuntimeException("Currency is not entered");
            if (Objects.isNull(currency.getId()) || Objects.isNull(currency.getName()))
                throw new RuntimeException("Bad currency data");
            if (!currencyRepository.existsById(currency.getId()))
                throw new RuntimeException("Nothing to update");
            return currencyRepository.save(currency);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        currencyRepository.deleteById(id);

    }

    @Override
    public Currency getById(Long id) {

        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Currency> currency = currencyRepository.findById(id);
        if (currency.isPresent())
            return currency.get();
        throw new RuntimeException("Currency is not found");
    }

    @Override
    public List<Currency> findAll() {
        List<Currency> currencies = (List<Currency>) currencyRepository.findAll();
        return currencies
                .parallelStream()
                .collect(Collectors.toList());
    }

    @Autowired

    public void setCurrencyRepository(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }
}
