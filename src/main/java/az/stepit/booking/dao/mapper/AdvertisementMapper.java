package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.*;
import az.stepit.booking.dao.provider.AdvertisementProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AdvertisementMapper {

    @Select({"Select * from booking.advertisement where is_active=1 and id=#{id}"})
    Advertisement getById(Long id);


    @Results(value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "currency",column = "currency_id",javaType = Currency.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.CurrencyMapper.getById")),
            @Result(property = "hotel",column = "hotel_id",javaType = Hotel.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.HotelMapper.getById" )),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.UserMapper.getById" ))

    })
    @Select("Select * from booking.advertisement where is_active=1")
    List<Advertisement> getActiveAdvertisement();

    @Select("Select * from booking.advertisement")
    List<Advertisement> getAllAdvertisement();

    @Results(value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "currency",column = "currency_id",javaType = Currency.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.CurrencyMapper.getById" )),
            @Result(property = "hotel",column = "hotel_id",javaType = Hotel.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.HotelMapper.getById" )),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.UserMapper.getById" ))

    })
    //@Select("Select * from booking.advertisement where is_active=1")
    @SelectProvider(type = AdvertisementProvider.class,method = "getAllAdvertisementByFilterQuery")
    List<Advertisement> getAllAdvertisementByFilter(SearchDTO searchDTO);
}
