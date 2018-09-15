package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "advertisement")

public class Advertisment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    private Currency currency;

    private String description;
    private Date lastUpdate;
    private String label;
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
