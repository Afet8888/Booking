package az.stepit.booking.dao.mapper;

import az.stepit.booking.constant.Queries;
import az.stepit.booking.dao.dto.FilterDto;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.provider.AdvertisementProvider;
import az.stepit.booking.dao.typehandler.FilterItemTypeHandler;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface FilterMapper {

    @Results(
            value = {
                    @Result(property = "count",column = "count"),
                    @Result(property = "city",column = "city",javaType = List.class,typeHandler = FilterItemTypeHandler.class),
                    @Result(property = "star",column = "star",javaType = List.class,typeHandler = FilterItemTypeHandler.class),
                    @Result(property = "hotel",column = "hotel",javaType = List.class,typeHandler = FilterItemTypeHandler.class),
                    @Result(property = "type",column = "type",javaType = List.class,typeHandler = FilterItemTypeHandler.class),
                    @Result(property = "capacity",column = "capacity",javaType = List.class,typeHandler = FilterItemTypeHandler.class)
            }
    )
    @SelectProvider(type = AdvertisementProvider.class,method = "getFiltersQuery")
    public FilterDto getFilterData(SearchDTO searchDTO);
}
