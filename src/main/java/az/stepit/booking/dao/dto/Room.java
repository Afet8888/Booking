package az.stepit.booking.dao.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JsonBackReference
    private Hotel hotel;

    private Integer isActive;

    @ManyToOne
    @JoinColumn(name = "capacity_id")
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
