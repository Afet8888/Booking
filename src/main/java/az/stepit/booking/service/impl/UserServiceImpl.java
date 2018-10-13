package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.dto.User;
import az.stepit.booking.dao.mapper.UserMapper;
import az.stepit.booking.dao.repository.UserRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static az.stepit.booking.constant.ServiceNames.USER;

@Service (USER)
public class UserServiceImpl implements AbstractService<User,Long> {

    @Autowired
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

    @Override
    public List<User> findAll(SearchDTO searchDTO) {
        return null;
    }


}
