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
        if (Objects.isNull(picture)) throw new RuntimeException("Picture is not entered");
        if (Objects.isNull(picture.getId())) throw new RuntimeException("Bad picture data");
        return pictureRepository.save(picture);
    }

    @Override
    public Picture update(Picture picture) {
        if (Objects.isNull(picture)) throw new RuntimeException("Picture is not entered");
        if (Objects.isNull(picture.getId())) throw new RuntimeException("Bad picture data");
        if (!pictureRepository.existsById(picture.getId()))
            throw new RuntimeException("Nothing to update");
        return pictureRepository.save(picture);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        pictureRepository.deleteById(id);

    }

    @Override
    public Picture getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Picture> picture = pictureRepository.findById(id);
        if (picture.isPresent())
        return picture.get();
        throw new RuntimeException("Picture is not found");
    }

    @Override
    public List<Picture> findAll() {
        List<Picture> pictures = (List<Picture>) pictureRepository.findAll();
        return pictures
                .parallelStream()
                .collect(Collectors.toList());
    }

    @Autowired

    public void setPictureRepository(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }
}
