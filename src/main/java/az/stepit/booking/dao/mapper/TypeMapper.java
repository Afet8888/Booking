package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface TypeMapper {

    @Select("Select * from booking.type where is_active=1 and id=#{id}")
    Type getById(Long id);

    @Select("Select * from booking.type where is_active=1")
    List<Type> getActiveType();

    @Select("Select * from booking.type")
    List<Type> getAllType();
}
