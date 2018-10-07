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
        if (Objects.isNull(hotel)) throw new RuntimeException("Hotel is not entered");
        if (Objects.isNull(hotel.getId()) || Objects.isNull(hotel.getName()))
        throw new RuntimeException("Bad hotel data");
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel) {
        if (Objects.isNull(hotel)) throw new RuntimeException("Hotel is not entered");
        if (Objects.isNull(hotel.getId()) || Objects.isNull(hotel.getName()))
            throw new RuntimeException("Bad hotel data");
        if (!hotelRepository.existsById(hotel.getId()))
            throw new RuntimeException("Nothing to update");
        return hotelRepository.save(hotel);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        hotelRepository.deleteById(id);

    }

    @Override
    public Hotel getById(Long id) {
    if (Objects.isNull(id)) throw new RuntimeException("No id");
    Optional<Hotel> hotel = hotelRepository.findById(id);
    if (hotel.isPresent())
        return hotel.get();
    throw new RuntimeException("Hotel is not found");
    }

    @Override
    public List<Hotel> findAll() {
        List<Hotel> hotels = (List<Hotel>) hotelRepository.findAll();
        return hotels
                .parallelStream()
                .collect(Collectors.toList());
    }

    @Autowired

    public void setHotelRepository(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
}
