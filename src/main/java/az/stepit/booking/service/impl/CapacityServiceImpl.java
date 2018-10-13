package az.stepit.booking.service.impl;

import az.stepit.booking.annatation.ServiceMethod;
import az.stepit.booking.dao.dto.Capacity;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.CapacityMapper;
import az.stepit.booking.dao.repository.CapacityRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static az.stepit.booking.constant.ServiceNames.CAPACITY;

@Service (CAPACITY)
public class CapacityServiceImpl implements AbstractService<Capacity,Long> {

    @Autowired
    private CapacityRepository capacityRepository;


    @Override
    public List<Capacity> findAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    @ServiceMethod
    public Capacity save(Capacity capacity) {
        if (Objects.isNull(capacity)) throw new RuntimeException("Capacity is not entered");
        if (Objects.isNull(capacity.getName()))
        throw new RuntimeException("Bad capacity data");
        return capacityRepository.save(capacity);
    }

    @Override
    @ServiceMethod
    public Capacity update(Capacity capacity) {
        if (Objects.isNull(capacity)) throw new RuntimeException("Capacity is not entered");
        if (Objects.isNull(capacity.getId()) || Objects.isNull(capacity.getName()))
            throw new RuntimeException("Bad capacity data");
        if (!capacityRepository.existsById(capacity.getId()))
            throw new RuntimeException("Nothing to update");
        return capacityRepository.save(capacity);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        capacityRepository.deleteById(id);

    }

    @Override
    public Capacity getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Capacity> capacity = capacityRepository.findById(id);
        if (capacity.isPresent())
            return capacity.get();
        throw new RuntimeException("City is not found");
    }

    @Override
    public List<Capacity> findAll() {
        List<Capacity> capacities = (List<Capacity>) capacityRepository.findAll();
        return capacities
                .parallelStream()
                .collect(Collectors.toList());
    }


}
