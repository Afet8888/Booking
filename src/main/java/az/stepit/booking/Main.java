package az.stepit.booking;

import az.stepit.booking.dao.Dao;
import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.FilterDto;
import az.stepit.booking.dao.dto.IdDTO;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.AdvertisementMapper;
import az.stepit.booking.dao.mapper.FilterMapper;
import az.stepit.booking.dao.mapper.UserMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static az.stepit.booking.logger.Log.info;

@Component
public class Main {

    @Autowired
    UserMapper testMapper;

    @Autowired
    Dao dao;

    @Autowired
    AdvertisementMapper advertisementMapper;

    @Autowired
    FilterMapper filterMapper;

    ObjectMapper mapper = new ObjectMapper();


    @PostConstruct
    public void init() throws JsonProcessingException, InterruptedException {
        SearchDTO searchDTO = new SearchDTO();
//        searchDTO.setStars(Arrays.asList(new IdDTO(2L),new IdDTO(5L)));
        searchDTO.setCities(Arrays.asList(new IdDTO(3L)));
        searchDTO.setLimit(1);
        List<Advertisement> advertisements = advertisementMapper.getAllAdvertisementByFilter(searchDTO);
        FilterDto filterData = filterMapper.getFilterData(searchDTO);
        info("************************************STARTING************************************");
        info("************************************START ADVERTISEMENTS************************************");
        advertisements.forEach((advertisement -> {
            try {
                info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(advertisement));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }));
        info("************************************ END ADVERTISEMENTS************************************");
        info("************************************START FILTER ************************************");
        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(filterData));
        info("************************************END FILTER ************************************");

        info("************************************ENDING************************************");
        Thread.sleep(1000000);
    }
}
