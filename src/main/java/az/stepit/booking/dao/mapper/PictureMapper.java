package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.dao.dto.Picture;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface PictureMapper {

    @Results(value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "hotel",column = "hotel_id",javaType = Hotel.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.HotelMapper.getById" )),

    })
    @Select("Select * from booking.pictures where is_active=1 and id=#{id}")
    Picture getById(Long id);

    @Results(value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "hotel",column = "hotel_id",javaType = Hotel.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.HotelMapper.getById" )),

    })
    @Select("Select * from booking.pictures where is_active=1 and hotel_id=#{id}")
    List<Picture> getByHotelId(Long id);

    @Select("Select * from booking.pictures where is_active=1")
    List<Picture> getActivePicture();

    @Select("Select * from booking.pictures")
    List<Picture> getAllPicture();


}


