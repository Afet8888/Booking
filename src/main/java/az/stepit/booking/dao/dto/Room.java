package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String description;
    private Float price;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "capaity_id")
    private Capacity capacity;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    private Integer extrabedCount;
    private Float extrabedPrice;
    private Integer count;
    private Date availableDateTo;
    private Date availableDateFrom;
}
