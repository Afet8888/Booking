package az.stepit.booking.service;

import az.stepit.booking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service("userDetailService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserServiceImpl userService;

    public UserDetailsServiceImpl(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        az.stepit.booking.dao.dto.User user = userService.findByUsername(username);
        return new User(user.getUsername(), user.getPassword(), emptyList());
    }
}
