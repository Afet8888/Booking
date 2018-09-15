package az.stepit.booking.dao.dto;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "currency")

public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private Long id;

    @OneToMany(mappedBy = "currency")
    List<Advertisment> advertisments;

    private String name;
    private String label;
    private Boolean isActive;

}
