package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.dto.Star;
import az.stepit.booking.dao.mapper.StarMapper;
import az.stepit.booking.dao.repository.StarRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
