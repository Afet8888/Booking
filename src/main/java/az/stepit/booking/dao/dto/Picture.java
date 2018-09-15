package az.stepit.booking.dao.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pictures")

public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    private String path;
    private Boolean isActive;

}
