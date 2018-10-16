//package az.stepit.booking;
//
//import az.stepit.booking.dao.dto.City;
//import az.stepit.booking.dao.dto.Hotel;
//import az.stepit.booking.dao.mapper.FilterMapper;
//import az.stepit.booking.registry.AbstractFactory;
//import az.stepit.booking.registry.MethodRegistry;
//import az.stepit.booking.service.AbstractService;
//import az.stepit.booking.service.impl.CityServiceImpl;
//import az.stepit.booking.service.impl.HotelServiceImpl;
//import az.stepit.booking.service.impl.TypeServiceImpl;
//import az.stepit.booking.utility.Utility;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.lang.reflect.InvocationTargetException;
//
//@Component
//public class ServiceTest {
//
//    @Autowired
//    ObjectMapper mapper;
//
//    @Autowired
//    CityServiceImpl cityService;
//
//    @Autowired
//    HotelServiceImpl hotelService;
//
//    @Autowired
//    AbstractFactory factory;
//
//    @Autowired
//    FilterMapper filterMapper;
//
//    @PostConstruct
//    public void init() throws InvocationTargetException, IllegalAccessException, JsonProcessingException {
////        City city = new City();
////        city.setId(3L);
////
////        Hotel hotel = new Hotel();
////        hotel.setName("Marriot3");
////        hotel.setCity(city);
//////        hotelService.save(hotel);
////        MethodRegistry.getRegistry().get("hotel").get("save").invoke(factory.get("hotel",AbstractService.class),hotel);
//        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(filterMapper.getFilterData()));
//
//    }
//}
