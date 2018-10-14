package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.dto.User;
import az.stepit.booking.dao.mapper.UserMapper;
import az.stepit.booking.dao.repository.UserRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static az.stepit.booking.constant.ServiceNames.USER;

@Service (USER)
public class UserServiceImpl implements AbstractService<User,Long> {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
        if (Objects.isNull(user)) throw new RuntimeException("User is not entered");
        if (Objects.isNull(user.getName())) throw new RuntimeException("Bad user data");
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        if (Objects.isNull(user)) throw new RuntimeException("User is not entered");
        if (Objects.isNull(user.getName()))
            throw new RuntimeException("Bad user data");
        if (!userRepository.existsById(user.getId()))
            throw new RuntimeException("Nothing to update");
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        userRepository.deleteById(id);
    }

    @Override
    public User getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent())
        return user.get();
        throw new RuntimeException("User is not found");
    }

    @Override
    public List<User> findAll() {
        List<User>users = (List<User>) userRepository.findAll();
        return users
                .parallelStream()
                .collect(Collectors.toList());
    }

    @Override
    public List<User> findAll(SearchDTO searchDTO) {
        return null;
    }


}
