package az.stepit.booking.service;

import az.stepit.booking.dao.dto.Type;

import java.util.List;

public interface TypeService {

    Type save (Type type);
    Type update (Type type);
    void delete(Long id);
    Type getById(Long id);
    List<Type> findAll();
}
