package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Capacity;

import java.util.List;

public interface CapacityService {

    Capacity save (Capacity capacity);
    Capacity update (Capacity capacity);
    void delete(Long id);
    Capacity getById(Long id);
    List<Capacity> findAll();
}
