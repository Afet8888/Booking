package az.stepit.booking.dao.mapper;

import az.stepit.booking.dao.dto.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityMapper {

    @Select("Select * from booking.cities where is_active=1 and id=#{id}")
    City getById(Long id);

    @Select("Select * from booking.cities where is_active=1")
    List<City> getActiveCity();

    @Select("Select * from booking.cities")
    List<City> getAllCity();
}
