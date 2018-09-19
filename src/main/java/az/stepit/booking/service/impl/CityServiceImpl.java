package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.City;
import az.stepit.booking.dao.repository.CityRepository;
import az.stepit.booking.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Override
    public City save(City city) {
        if (Objects.isNull(city)) throw new RuntimeException("City is not entered");
        if (Objects.isNull(city.getId()) || Objects.isNull(city.getName()))
            throw new RuntimeException("Bad city data");
             return cityRepository.save(city);
    }

    @Override
    public City update(City city) {
        if (Objects.isNull(city)) throw new RuntimeException("City is not entered");
        if (Objects.isNull(city.getId()) || Objects.isNull(city.getName()))
            throw new RuntimeException("Bad city data");
        if (!cityRepository.existsById(city.getId()))
            throw new RuntimeException("Nothing tu update");
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
    public List<City> findAll() {
        List<City> cities = (List<City>) cityRepository.findAll();
        return cities
                .parallelStream()
                .collect(Collectors.toList());
    }

    @Autowired
    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
}
