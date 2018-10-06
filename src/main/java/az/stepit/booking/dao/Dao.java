package az.stepit.booking.dao;

import az.stepit.booking.dao.dto.FilterDto;
import az.stepit.booking.dao.dto.IdDTO;
import az.stepit.booking.dao.dto.User;
import az.stepit.booking.dao.mapper.UserMapper;
import az.stepit.booking.dao.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Dao {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private StarRepository starRepository;

    @Autowired
    private CapacityRepository capacityRepository;

    @Autowired
    TypeRepository typeRepository;

    @Autowired
    HotelRepository hotelRepository;

    public List<User> getAllTest() {
        return mapper.getAllUser();
    }

    public FilterDto getFilterDto(){
        FilterDto dto = new FilterDto();
        dto.setCity(buildIdDTOList(cityRepository.getAllOnlyId()));
        dto.setStar(buildIdDTOList(starRepository.getAllOnlyId()));
        dto.setCapacity(buildIdDTOList(capacityRepository.getAllOnlyId()));
        dto.setType(buildIdDTOList(typeRepository.getAllOnlyId()));
        dto.setHotel(buildIdDTOList(hotelRepository.getAllOnlyId()));
        return dto;
    }

    private List<IdDTO> buildIdDTOList(List<Long> list){
        List<IdDTO> idDTOList = new ArrayList<>();
        for (Long l:list){
            idDTOList.add(new IdDTO(l));
        }
        return idDTOList;
    }
}
