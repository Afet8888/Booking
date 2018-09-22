package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Picture;

import java.util.List;

public interface PictureService {

    Picture save (Picture picture);
    Picture update (Picture picture);
    void delete(Long id);
    Picture getById(Long id);
    List<Picture> findAll();
}
