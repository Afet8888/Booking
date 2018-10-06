package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoomMapper {

    @Select("Select * from booking.rooms where is_active=1 and id=#(id)")
    Room getRoomById(Long id);

    @Select("Select * from booking.rooms where is_active=1")
    List<Room> getActiveRoom();

    @Select("Select * from booking.rooms")
    List<Room> getAllRoom();
}
