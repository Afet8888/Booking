package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rooms")


public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String description;
    private Float price;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    private Boolean isActive;
    private Integer capacity;
}
