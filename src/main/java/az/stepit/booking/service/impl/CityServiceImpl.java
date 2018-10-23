package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.City;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.CityMapper;
import az.stepit.booking.dao.repository.CityRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static az.stepit.booking.constant.ServiceNames.CITY;

@Service (CITY)
public class CityServiceImpl implements AbstractService<City,Long> {

    @Autowired
    private CityRepository cityRepository;


    @Override
    public City save(City city) {
        if (Objects.isNull(city)) throw new RuntimeException("City is not entered");
        if (Objects.isNull(city.getName()))
            throw new RuntimeException("Bad city data");
             return cityRepository.save(city);
    }

    @Override
    public City update(City city) {
        if (Objects.isNull(city)) throw new RuntimeException("City is not entered");
        if (Objects.isNull(city.getId()) || Objects.isNull(city.getName()))
            throw new RuntimeException("Bad city data");
        if (!cityRepository.existsById(city.getId()))
            throw new RuntimeException("Nothing to update");
        return cityRepository.save(city);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        cityRepository.deleteById(id);

    }

    @Override
    public City getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<City> city = cityRepository.findById(id);
        if (city.isPresent())
        return city.get();
        throw new RuntimeException("City is not found");
    }

    @Override
    public List<City> findAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public List<City> findAll() {
        List<City> cities = (List<City>) cityRepository.findAll();
        return cities;
    }

}
