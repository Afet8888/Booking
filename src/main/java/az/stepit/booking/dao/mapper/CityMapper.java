package az.stepit.booking.dao.mapper;

import az.stepit.booking.dao.dto.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    @Select("select id from booking.cities")
    public List<City> getAllOnlyId();
}
