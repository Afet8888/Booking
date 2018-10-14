package az.stepit.booking.controller;

import az.stepit.booking.dao.repository.ApplicationUserRepository;
import az.stepit.booking.model.ApplicationUser;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sherif on 6/1/2018.
 */

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:3000")
public class UserControllerService {

    private ApplicationUserRepository applicationUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserControllerService(ApplicationUserRepository applicationUserRepository,
                                 BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        applicationUserRepository.save(user);
    }


    @PostMapping("/test")
    public String test() {
        return "TEST IS WORKING";
    }
}