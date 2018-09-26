package az.stepit.booking.dao.dto;

import lombok.Data;

import java.util.List;

@Data
public class FilterDto {
    private List<IdDTO> city;
    private List<IdDTO> star;
    private List<IdDTO> hotel;
    private List<IdDTO> type;
    private List<IdDTO> capacity;
}
