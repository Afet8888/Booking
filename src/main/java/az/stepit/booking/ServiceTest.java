package az.stepit.booking;

import az.stepit.booking.dao.dto.City;
import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.service.impl.CityServiceImpl;
import az.stepit.booking.service.impl.HotelServiceImpl;
import az.stepit.booking.service.impl.TypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ServiceTest {

    @Autowired
    CityServiceImpl cityService;

    @Autowired
    HotelServiceImpl hotelService;

    @PostConstruct
    public void init(){
        City city = new City();
        city.setId(3L);

        Hotel hotel = new Hotel();
        hotel.setName("Marriot");
        hotel.setCity(city);
        hotelService.save(hotel);
    }
}
