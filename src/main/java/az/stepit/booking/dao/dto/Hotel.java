package az.stepit.booking.dao.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    Advertisement advertisement;


    @OneToMany(mappedBy = "hotel")
            @JsonManagedReference
    List<Room> rooms;

    @OneToMany(mappedBy = "hotel")
    List<Picture> pictures;

    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "star_id")
    private Star star;


    private String phoneNumber;
    private Integer isActive;
}
