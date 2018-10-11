package az.stepit.booking.dao.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SearchDTO {

    private List<IdDTO> cities;
    private List<IdDTO> stars;
    private IdDTO hotel;
    private List<IdDTO> types;
    private List<IdDTO> capacities;
    private Float priceFrom;
    private Float priceTo;
    private Date dateFrom;
    private Date dateTo;

}
