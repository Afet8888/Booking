package az.stepit.booking.service.impl;

import az.stepit.booking.annotation.ServiceMethod;
import az.stepit.booking.constant.ServiceNames;
import az.stepit.booking.dao.dto.Hotel;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.HotelMapper;
import az.stepit.booking.dao.repository.HotelRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service(ServiceNames.HOTEL)
public class HotelServiceImpl implements AbstractService<Hotel, Long> {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private HotelMapper hotelMapper;


    @Override
    public List<Hotel> findAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    @ServiceMethod
    public Hotel save(Hotel hotel) {
        if (Objects.isNull(hotel)) throw new RuntimeException("Hotel is not entered");
        if (Objects.isNull(hotel.getName())) throw new RuntimeException("Bad hotel data");
        if (Objects.isNull(hotel.getRooms()) || hotel.getRooms().isEmpty())
            throw new RuntimeException("Hotel rooms not entered!");
        if (Objects.isNull(hotel.getStar())) throw new RuntimeException("Hotel's star not entered!");
        if (Objects.isNull(hotel.getCity())) throw new RuntimeException("Hotel's city not entered!");
        if (Objects.isNull(hotel.getPictures()) || hotel.getPictures().isEmpty())
            throw new RuntimeException("Hotel's picture not entered!");
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel) {
        if (Objects.isNull(hotel)) throw new RuntimeException("Hotel is not entered");
        if (Objects.isNull(hotel.getId()) || Objects.isNull(hotel.getName()))
            throw new RuntimeException("Bad hotel data");
        if (Objects.isNull(hotel.getRooms())) throw new RuntimeException("Bad hotel's room data");
        if (Objects.isNull(hotel.getStar())) throw new RuntimeException("Bad hotel's star data");
        if (Objects.isNull(hotel.getCity())) throw new RuntimeException("Bad hotel's city data");
        if (!hotelRepository.existsById(hotel.getId())) throw new RuntimeException("Nothing to update");
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
        List<Hotel> hotels = (List<Hotel>) hotelMapper.getAllHotel();
        return hotels
                .parallelStream()
                .collect(Collectors.toList());
    }

}


