package az.stepit.booking.dao.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SearchDTO {

    private static final int DEFAULT_LIMIT = 10;
    private static final int DEFAULT_PAGE = 1;

    private List<IdDTO> cities;
    private List<IdDTO> stars;
    private IdDTO hotel;
    private List<IdDTO> types;
    private List<IdDTO> capacities;
    private Float priceFrom;
    private Float priceTo;
    private Date dateFrom;
    private Date dateTo;
    private Integer limit = DEFAULT_LIMIT;
    private Integer page = DEFAULT_PAGE;

}
