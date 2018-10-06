package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Star;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StarMapper {

    @Select("Select * from booking.stars where is_active=1 and id=#(id)")
    Star getById(Long id);

    @Select("Select * from booking.stars where is_active=1")
    List<Star> getActiveStar();

    @Select("Select * from booking.stars")
    List<Star> getAllStar();
}
