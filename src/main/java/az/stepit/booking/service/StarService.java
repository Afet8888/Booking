package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Star;

import java.util.List;

public interface StarService {

    Star save (Star star);
    Star update (Star star);
    void delete(Long id);
    Star getById(Long id);
    List<Star> findAll();
}
