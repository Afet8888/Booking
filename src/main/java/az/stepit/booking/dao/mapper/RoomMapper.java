package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Capacity;
import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.dao.dto.Room;
import az.stepit.booking.dao.dto.Type;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RoomMapper {

    @Results(value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "capacity",column = "capacity_id",javaType = Capacity.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.CapacityMapper.getById" )),
            @Result(property = "hotel",column = "hotel_id",javaType = Hotel.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.HotelMapper.getById" )),
            @Result(property = "type",column = "type_id",javaType = Type.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.TypeMapper.getById" ))

    })

    @Select("Select * from booking.rooms where is_active=1 and id=#{id}")
    Room getById(Long id);


    @Results(value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "capacity",column = "capacity_id",javaType = Capacity.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.CapacityMapper.getById" )),
            @Result(property = "hotel",column = "hotel_id",javaType = Hotel.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.HotelMapper.getById" )),
            @Result(property = "type",column = "type_id",javaType = Type.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.TypeMapper.getById" ))

    })
    @Select("Select * from booking.rooms where is_active=1 and hotel_id=#{id}")
    List<Room> getByHotelId(Long id);

    @Select("Select * from booking.rooms where is_active=1")
    List<Room> getActiveRoom();

    @Select("Select * from booking.rooms")
    List<Room> getAllRoom();


}
