package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user")
    List<Advertisement> advertisements;

    private String name;
    private String surname;
    private String email;
    private Integer isActive;
    private String username;
    private String password;
}
