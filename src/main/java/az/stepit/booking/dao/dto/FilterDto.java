package az.stepit.booking.dao.dto;

import az.stepit.booking.model.FilterItem;
import lombok.Data;

import java.util.List;

@Data
public class FilterDto {
    private List<FilterItem> city;
    private List<FilterItem> star;
    private List<FilterItem> hotel;
    private List<FilterItem> type;
    private List<FilterItem> capacity;
}
