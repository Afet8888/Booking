package az.stepit.booking;

import az.stepit.booking.constant.ResponseCodeAndMessages;
import az.stepit.booking.dao.Dao;
import az.stepit.booking.dao.dto.IdDTO;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.AdvertisementMapper;
import az.stepit.booking.dao.mapper.UserMapper;
import az.stepit.booking.model.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

import static az.stepit.booking.logger.Log.info;

@Component
public class Main {

    @Autowired
    UserMapper testMapper;

    @Autowired
    Dao dao;

    @Autowired
    AdvertisementMapper advertisementMapper;

    ObjectMapper mapper = new ObjectMapper();


    @PostConstruct
    public void init() throws JsonProcessingException, InterruptedException {
        SearchDTO searchDTO = new SearchDTO();
        searchDTO.setStar(new IdDTO(2L));
        info("************************************STARTING************************************");
        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(advertisementMapper.getAllAdvertisementByFilter(searchDTO)));
        info("************************************ENDING************************************");
        Thread.sleep(100000);
    }
}
