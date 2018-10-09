package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.Type;
import az.stepit.booking.dao.repository.TypeRepository;
import az.stepit.booking.service.AbstractService;
import az.stepit.booking.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TypeServiceImpl implements AbstractService<Type,Long> {

    private TypeRepository typeRepository;

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

    @Autowired

    public void setTypeRepository(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }
}
