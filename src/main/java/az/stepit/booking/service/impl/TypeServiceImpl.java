package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.dto.Type;
import az.stepit.booking.dao.mapper.TypeMapper;
import az.stepit.booking.dao.repository.TypeRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static az.stepit.booking.constant.ServiceNames.TYPE;

@Service (TYPE)
public class TypeServiceImpl implements AbstractService<Type,Long> {

    @Autowired
    private TypeRepository typeRepository;



    @Override
    public List<Type> findAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public Type save(Type type) {
        return null;
    }

    @Override
    public Type update(Type type) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Type getById(Long id) {
        return null;
    }

    @Override
    public List<Type> findAll() {
        return null;
    }


}
