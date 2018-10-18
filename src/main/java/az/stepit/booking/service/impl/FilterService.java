package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.FilterDto;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.FilterMapper;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FilterService implements AbstractService<FilterDto,Integer> {

    @Autowired
    FilterMapper mapper;

    @Override
    public FilterDto save(FilterDto advertisement) {
        return null;
    }

    @Override
    public FilterDto update(FilterDto advertisement) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public FilterDto getById(Long id) {
        return null;
    }

    @Override
    public List<FilterDto> findAll() {
        return null;
    }

    @Override
    public List<FilterDto> findAll(SearchDTO searchDTO) {
        return Arrays.asList(mapper.getFilterData(searchDTO));
    }
}
