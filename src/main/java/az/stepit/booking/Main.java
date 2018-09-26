package az.stepit.booking;

import az.stepit.booking.constant.ResponseCodeAndMessages;
import az.stepit.booking.dao.Dao;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.TestMapper;
import az.stepit.booking.model.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

@Component
public class Main {

    @Autowired
   TestMapper testMapper;

    ObjectMapper mapper = new ObjectMapper();

    @PostConstruct
    public void init() throws JsonProcessingException {
        testMapper.getAll();
    }
}
