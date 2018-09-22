package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.User;
import az.stepit.booking.dao.repository.UserRepository;
import az.stepit.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Autowired

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
