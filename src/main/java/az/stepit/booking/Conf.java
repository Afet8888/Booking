package az.stepit.booking;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("az.stepit.booking.dao.mapper")
public class Conf {

}
