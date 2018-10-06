package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HotelMapper {

    @Select("Select * from booking.hotels where is_active=1 and id=#(id)")
    Hotel getHotelById(Long id);

    @Select("Select * from booking.hotels where is_active=1")
    List<Hotel> getActiveHotel();

    @Select("Select * from booking.hotels")
    List<Hotel> getAllHotel();
}
