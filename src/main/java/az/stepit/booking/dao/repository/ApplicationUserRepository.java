package az.stepit.booking.dao.repository;

import az.stepit.booking.model.ApplicationUser;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sherif on 6/1/2018.
 */
@Repository
public class ApplicationUserRepository {

    private Map<String,ApplicationUser> users = new HashMap<>();

    public ApplicationUser findByUsername(String username){
        return users.get(username);
    };

    public void save(ApplicationUser user){
        if (users.get(user.getUsername())==null)
        users.put(user.getUsername(),user);
    }

}
