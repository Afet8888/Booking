package az.stepit.booking.dao.typehandler;

import az.stepit.booking.dao.dto.City;
import az.stepit.booking.model.FilterItem;
import az.stepit.booking.utility.Utility;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FilterItemTypeHandler extends BaseTypeHandler<List<FilterItem>> {


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<FilterItem> cities, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public List<FilterItem> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String res = resultSet.getString(s);
        List<FilterItem> list = new ArrayList<>();
        try {
            FilterItem c;
            c = Utility.convert(res,FilterItem.class);
            list.add(c);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<FilterItem> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public List<FilterItem> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }

}
