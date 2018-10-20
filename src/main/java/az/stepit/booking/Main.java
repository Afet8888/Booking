package az.stepit.booking;

import az.stepit.booking.dao.Dao;
import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.FilterDto;
import az.stepit.booking.dao.dto.IdDTO;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.AdvertisementMapper;
import az.stepit.booking.dao.mapper.FilterMapper;
import az.stepit.booking.dao.mapper.UserMapper;
import az.stepit.booking.model.AdvertisementResponse;
import az.stepit.booking.service.impl.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static az.stepit.booking.logger.Log.info;

@Component
public class Main {

    @Autowired
    UserMapper testMapper;

    @Autowired
    Dao dao;


    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    AdvertisementServiceImpl service;

    @Autowired
    FilterService filterService;

    @Autowired
    BookingService bookingService;

    @Autowired
    StarServiceImpl starService;

    @Autowired
    CapacityServiceImpl capacityService;

    @Autowired
    CurrencyServiceImpl currencyService;

    @Autowired
    HotelServiceImpl hotelService;

    @Autowired
    PictureServiceImpl pictureService;

    @Autowired
    RoomServiceImpl roomService;

    @Autowired
    TypeServiceImpl typeService;

    @Autowired
    UserServiceImpl userService;

    @PostConstruct
    public void init() throws JsonProcessingException, InterruptedException, ParseException {
        SearchDTO searchDTO = new SearchDTO();
//        searchDTO.setStars(Arrays.asList(new IdDTO(2L),new IdDTO(5L)));
        searchDTO.setCities(Arrays.asList(new IdDTO(3L)));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateFrom = sdf.parse("2018-10-03");
        Date dateTo = sdf.parse("2018-10-09");
        searchDTO.setDateFrom(dateFrom);
        searchDTO.setDateTo(dateTo);
        //searchDTO.setLimit(1);
        AdvertisementResponse response = bookingService.getAdvertisementAndFilter(searchDTO);
        //info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));

//        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(starService.findAll()));
//        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(capacityService.findAll()));
//        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(currencyService.findAll()));
//        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotelService.findAll()));
//        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pictureService.findAll()));
//        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(roomService.findAll()));
//        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(typeService.findAll()));
        info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(userService.findAll()));

        Thread.sleep(1000000);
    }
}
