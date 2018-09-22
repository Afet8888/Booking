package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Picture;
import az.stepit.booking.dao.repository.PictureRepository;
import az.stepit.booking.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PictureServiceImpl implements PictureService {

    private PictureRepository pictureRepository;

    @Override
    public Picture save(Picture picture) {
        return null;
    }

    @Override
    public Picture update(Picture picture) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Picture getById(Long id) {
        return null;
    }

    @Override
    public List<Picture> findAll() {
        return null;
    }

    @Autowired

    public void setPictureRepository(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }
}
