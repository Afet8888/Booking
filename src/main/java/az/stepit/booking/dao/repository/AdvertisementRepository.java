package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.FilterDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.event.ListDataEvent;
import java.util.List;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Long> {
}
