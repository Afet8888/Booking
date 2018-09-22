package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Advertisement;

import java.util.List;

public interface AdvertisementService {

    Advertisement save (Advertisement advertisement);
    Advertisement update (Advertisement advertisement);
    void delete(Long id);
    Advertisement getById(Long id);
    List<Advertisement> findAll();
}
