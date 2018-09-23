package az.stepit.booking.dao;

import az.stepit.booking.dao.mapper.TestMapper;
import az.stepit.booking.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Dao {
    @Autowired
    private TestMapper mapper;

    public List<Test> getAllTest() {
        return mapper.getAll();
    }
}
