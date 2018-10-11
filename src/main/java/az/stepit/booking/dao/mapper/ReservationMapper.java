package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Reservation;
import az.stepit.booking.dao.dto.Room;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface ReservationMapper {

    @Results(value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "room",column = "room_id",javaType = Room.class,
                    many = @Many(select = "az.stepit.booking.dao.mapper.RoomMapper.getById" )),
    })

    @Select("Select * from booking.reservations where is_active=1 and id=#{id}")
    Reservation getById(Long id);

    @Select("Select * from booking.reservations where is_active=1")
    List<Reservation> getActiveReservation();

    @Select("Select * from booking.reservations")
    List<Reservation> getAllReservation();

 }
