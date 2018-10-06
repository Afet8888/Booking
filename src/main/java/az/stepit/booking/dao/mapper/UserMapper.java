package az.stepit.booking.dao.mapper;

import az.stepit.booking.dao.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("Select * from booking.users where is_active=1 and id=#(id)")
    User getUserById(Long id);

    @Select("Select * from booking.users where is_active=1")
    List<User> getActiveUser();

    @Select("Select * from booking.users")
    List<User> getAllUser();
}
