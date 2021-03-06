package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Capacity;
import az.stepit.booking.dao.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface CapacityMapper {

    @Select("Select * from booking.capacity where is_active=1 and id=#{id}")
    Capacity getById(Long id);

    @Select("Select * from booking.capacity where is_active=1")
    List<Capacity> getActiveCapacity();

    @Select("Select * from booking.capacity")
    List<Capacity> getAllCapacity();

}
