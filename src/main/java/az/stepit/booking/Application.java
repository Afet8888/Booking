package az.stepit.booking;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("az.stepit.booking.dao.mapper")
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
