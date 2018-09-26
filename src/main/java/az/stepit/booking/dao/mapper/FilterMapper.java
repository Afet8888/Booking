package az.stepit.booking.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FilterMapper {

    @Select("")
    public void getFilterData();
}
