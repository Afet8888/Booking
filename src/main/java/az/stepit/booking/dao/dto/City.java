package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cities")

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String name;

@OneToMany(mappedBy = "city")
    List<Hotel>hotels;

private String label;
private Boolean isActive;

}
