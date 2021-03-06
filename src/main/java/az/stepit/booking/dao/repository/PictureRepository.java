package az.stepit.booking.dao.repository;

import az.stepit.booking.dao.dto.Picture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends CrudRepository<Picture, Long> {
}
