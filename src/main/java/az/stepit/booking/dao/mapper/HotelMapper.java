package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.City;
import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.dao.dto.Star;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HotelMapper {


    @Results(value = {
            @Result(property = "star",column = "star_id",javaType = Star.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.StarMapper.getById" )),
            @Result(property = "city",column = "city_id",javaType = City.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.CityMapper.getById" )),
            @Result(property = "advertisement",column = "advertisement_id",javaType = Advertisement.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.AdvertisementMapper.getById" ))
    })
    @Select("Select * from booking.hotels where is_active=1 and id=#(id)")
    Hotel getById(Long id);

    @Select("Select * from booking.hotels where is_active=1")
    List<Hotel> getActiveHotel();

    @Select("Select * from booking.hotels")
    List<Hotel> getAllHotel();

}


