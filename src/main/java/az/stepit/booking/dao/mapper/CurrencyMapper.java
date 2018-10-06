package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Currency;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CurrencyMapper {

    @Select("Select * from booking.currency where is_active=1 and id=#(id)")
    Currency getById(Long id);

    @Select("Select * from booking.currency where is_active=1")
    List<Currency> getActiveCurrency();

    @Select("Select * from booking.currency")
    List<Currency> getAllCurrency();
}
