package az.stepit.booking.service;

import az.stepit.booking.dao.dto.City;

import java.util.List;

public interface CityService {
    City save (City city);
    City update (City city);
    void delete(Long id);
    City getById(Long id);
    List<City> findAll();

}
