package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Star;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StarRepository extends CrudRepository<Star, Long> {

    @Query("select c.id from Star c where c.isActive=1")
    @Modifying
    @Transactional
    public List<Long> getAllOnlyId();
}
