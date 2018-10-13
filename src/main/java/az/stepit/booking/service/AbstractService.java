package az.stepit.booking.service;

import az.stepit.booking.dao.dto.SearchDTO;

import java.util.List;

public interface AbstractService<T,V> {
    T save (T advertisement);
    T update (T advertisement);
    void delete(V id);
    T getById(Long id);
    List<T> findAll();
    List<T> findAll(SearchDTO searchDTO);
}
