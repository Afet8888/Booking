package az.stepit.booking;

import az.stepit.booking.constant.ResponseCodeAndMessages;
import az.stepit.booking.dao.Dao;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.TestMapper;
import az.stepit.booking.model.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static az.stepit.booking.constant.ResponseCodeAndMessages.*;


@Component
public class Main {
    private static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) throws JsonProcessingException {
    }

    @Autowired
    Dao dao;

    TestMapper testMapper;

    ObjectMapper mapper = new ObjectMapper();

    @PostConstruct
}
