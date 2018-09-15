package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "hotels")

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @OneToOne(mappedBy = "hotel")
    Advertisment advertisment;


    @OneToMany(mappedBy = "hotel")
    List<Room> rooms;

    @OneToMany(mappedBy = "picture")
    List<Picture> pictures;

    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "star_id")
    private Star star;


    private String phoneNumber;
    private Boolean isActive;
}
