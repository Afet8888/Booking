package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Reservation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReservationMapper {

    @Select("Select * from booking.reservations where is_active=1 and id=#(id)")
    Reservation getReservationById(Long id);

    @Select("Select * from booking.reservations where is_active=1")
    List<Reservation> getActiveReservation();

    @Select("Select * from booking.reservations")
    List<Reservation> getAllReservation();
}
