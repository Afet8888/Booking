package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Currency;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {
}
