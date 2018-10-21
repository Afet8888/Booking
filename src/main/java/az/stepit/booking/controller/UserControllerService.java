package az.stepit.booking.controller;

import az.stepit.booking.dao.dto.User;
import az.stepit.booking.dao.repository.ApplicationUserRepository;
import az.stepit.booking.model.ApplicationUser;
import az.stepit.booking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;


/**
 * Created by Sherif on 6/1/2018.
 */

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:8080")
public class UserControllerService {

    @Autowired
    private UserServiceImpl userService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserControllerService(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/signUp")
    public void signUp(@RequestBody User user) {
        System.out.println("SIGNUP REQUEST");
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.save(user);
    }


    @PostMapping("/test")
    public String test() {
        return "TEST IS WORKING";
    }
}