package az.stepit.booking;

import az.stepit.booking.dao.mapper.CurrencyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

//@EnableAutoConfiguration
//@ComponentScan(basePackages = "az.stepit",
//        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,pattern = "az.stepit.booking.controller.*"))
@SpringBootApplication
public class Application {

    /*
     * Booking. Search hotels in certain city.
     * Choice a city from the list
     * Get all hotels in this city
     * Choice one hotel from the list and look all pictures and features
     * Choice dates of check in and check out, quantity of days
     * Choice quantity of rooms, adults and children
     * Get amount price
     * Give a comment and photo

     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


}
