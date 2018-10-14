package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.dto.Star;
import az.stepit.booking.dao.mapper.StarMapper;
import az.stepit.booking.dao.repository.StarRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static az.stepit.booking.constant.ServiceNames.STAR;

@Service (STAR)
public class StarServiceImpl implements AbstractService<Star,Long> {

    @Autowired
    private StarRepository starRepository;



    @Override
    public List<Star> findAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public Star save(Star star) {
        if (Objects.isNull(star)) throw new RuntimeException("Star is not entered");
        return starRepository.save(star);
    }

    @Override
    public Star update(Star star) {
        if (Objects.isNull(star)) throw new RuntimeException("Star is not entered");
        if (Objects.isNull(star.getId()) || Objects.isNull(star.getName()))
            throw new RuntimeException("Bad star data");
        if (!starRepository.existsById(star.getId()))
            throw new RuntimeException("Nothing to update");
        return starRepository.save(star);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        starRepository.deleteById(id);

    }

    @Override
    public Star getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Star> star = starRepository.findById(id);
        if (star.isPresent())
        return star.get();
        throw new RuntimeException("Star is not found");
    }

    @Override
    public List<Star> findAll() {
        List<Star> stars = (List<Star>) starRepository.findAll();
        return stars
                .parallelStream()
                .collect(Collectors.toList());
    }
}
