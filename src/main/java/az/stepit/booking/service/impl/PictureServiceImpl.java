package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Picture;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.PictureMapper;
import az.stepit.booking.dao.repository.PictureRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static az.stepit.booking.constant.ServiceNames.PICTURE;

@Service(PICTURE)
public class PictureServiceImpl implements AbstractService<Picture, Long> {

    @Autowired
    private PictureRepository pictureRepository;

    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public Picture save(Picture picture) {
        if (Objects.isNull(picture)) throw new RuntimeException("Picture is not entered");
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
    public List<Picture> findAll(SearchDTO searchDTO) {

        return null;
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
        List<Picture> pictures = (List<Picture>) pictureMapper.getAllPicture();
        return pictures
                .parallelStream()
                .collect(Collectors.toList());
    }

}
