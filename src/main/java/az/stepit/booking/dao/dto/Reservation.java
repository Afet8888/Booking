package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "reservation")

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date startDate;
    private Date endDate;
    private Integer nightCount;
    private Integer roomCount;
    private Integer questCount;
    private Integer childCount;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    private Float finishPrice;
    private String clientName;
    private String clientSurname;
    private String clientPhone;
    private Date reservationDate;

}
