package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.dao.repository.HotelRepository;
import az.stepit.booking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl implements HotelService {

    private HotelRepository hotelRepository;

    @Override
    public Hotel save(Hotel hotel) {
        return null;
    }

    @Override
    public Hotel update(Hotel hotel) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Hotel getById(Long id) {
        return null;
    }

    @Override
    public List<Hotel> findAll() {
        return null;
    }

    @Autowired

    public void setHotelRepository(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
}
