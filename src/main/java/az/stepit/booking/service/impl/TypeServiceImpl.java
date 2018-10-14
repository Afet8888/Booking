package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.dto.Type;
import az.stepit.booking.dao.mapper.TypeMapper;
import az.stepit.booking.dao.repository.TypeRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

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
        if (Objects.isNull(type)) throw new RuntimeException("Type is not entered");
        if (Objects.isNull(type.getName())) throw new RuntimeException("Bad type data");
        return typeRepository.save(type);
    }

    @Override
    public Type update(Type type) {
        if (Objects.isNull(type)) throw new RuntimeException("Type is not entered");
        if (Objects.isNull(type.getId()))
            throw new RuntimeException("Bad Type data");
        if (!typeRepository.existsById(type.getId()))
            throw new RuntimeException("Nothing to update");
        return typeRepository.save(type);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        typeRepository.deleteById(id);

    }

    @Override
    public Type getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Type> type = typeRepository.findById(id);
        if (type.isPresent())
            return type.get();
        throw new RuntimeException("Type is not found");
    }

    @Override
    public List<Type> findAll() {
        List<Type> types = (List<Type>) typeRepository.findAll();
        return types
                .parallelStream()
                .collect(Collectors.toList());
    }


}
