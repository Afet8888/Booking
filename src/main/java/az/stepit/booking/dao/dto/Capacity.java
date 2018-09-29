package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Capacity")

public class Capacity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "capacity")
    List<Room> rooms;

    private Integer capacity;
    private Integer isActive;
}
