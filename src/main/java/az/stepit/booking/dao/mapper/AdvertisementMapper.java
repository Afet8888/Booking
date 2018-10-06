package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.Currency;
import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.dao.dto.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdvertisementMapper {

    @Select("Select * from booking.advertisements where is_active=1 and id=#(id)")
    Advertisement getById(Long id);

    @Select("Select * from booking.advertisements where is_active=1")
    List<Advertisement> getActiveAdvertisement();

    @Select("Select * from booking.advertisements")
    List<Advertisement> getAllAdvertisement();

    @Results(value = {
            @Result(property = "currency",column = "currency_id",javaType = Currency.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.CurrencyMapper.getById" )),
            @Result(property = "hotel",column = "hotel_id",javaType = Hotel.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.HotelMapper.getById" )),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.UserMapper.getById" ))

    })
    @Select("Select * from booking.advertisements where is_active=1")
    List<Advertisement> getAllAdvertisementByFilter();
}
