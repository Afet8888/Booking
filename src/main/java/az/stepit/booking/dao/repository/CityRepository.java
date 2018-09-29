package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.City;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    @Query("select c.id from City c where c.isActive=1")
    @Modifying
    @Transactional
    public List<Long> getAllOnlyId();
}
