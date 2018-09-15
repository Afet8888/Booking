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
    List<Advertisment> advertisments;

    private String name;
    private String surname;
    private String email;
    private Boolean isActive;
    private String login;
    private String password;
}
