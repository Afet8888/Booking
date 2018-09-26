package az.stepit.booking.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import az.stepit.booking.model.Test;

import java.util.List;

@Mapper

public interface TestMapper {

        @Select("Select * from test")
        List<Test> getAll();
}
