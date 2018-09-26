package az.stepit.booking.dao.mapper;

import az.stepit.booking.dao.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("Select * from booking.users")
    List<User> getAll();

    @Select("Select * from booking.users")
    List<User> getFilterData();
}
