package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Star;
import az.stepit.booking.dao.repository.StarRepository;
import az.stepit.booking.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StarServiceImpl implements StarService {

    private StarRepository starRepository;

    @Override
    public Star save(Star star) {
        return null;
    }

    @Override
    public Star update(Star star) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Star getById(Long id) {
        return null;
    }

    @Override
    public List<Star> findAll() {
        return null;
    }

    @Autowired

    public void setStarRepository(StarRepository starRepository) {
        this.starRepository = starRepository;
    }
}
