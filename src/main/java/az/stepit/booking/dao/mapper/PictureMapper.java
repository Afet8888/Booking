package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PictureMapper {

    @Select("Select * from booking.pictures where is_active=1 and id=#(id)")
    Picture getPictureById(Long id);

    @Select("Select * from booking.pictures where is_active=1")
    List<Picture> getActivePicture();

    @Select("Select * from booking.pictures")
    List<Picture> getAllPicture();
}
