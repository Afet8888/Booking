package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.User;
import az.stepit.booking.service.UserService;
import az.stepit.booking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping
    User save(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping
    User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping ("{id}")
    void delete (@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping ("{id}")
    User getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }


}
