package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Hotel;

import java.util.List;

public interface HotelService {
    Hotel save (Hotel hotel);
    Hotel update (Hotel hotel);
    void delete(Long id);
    Hotel getById(Long id);
    List<Hotel> findAll();
}
