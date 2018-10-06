package az.stepit.booking.dao.mapper;


import az.stepit.booking.dao.dto.Advertisement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdvertisementMapper {

    @Select("Select * from booking.advertisements where is_active=1 and id=#(id)")
    Advertisement getAdvertisementById(Long id);

    @Select("Select * from booking.advertisements where is_active=1")
    List<Advertisement> getActiveAdvertisement();

    @Select("Select * from booking.advertisements")
    List<Advertisement> getAllAdvertisement();
}
