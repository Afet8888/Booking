package az.stepit.booking.model;

import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.FilterDto;
import lombok.Data;

import java.util.List;

@Data
public class AdvertisementResponse {
    private Response response;
    private List<Advertisement> advertisements;
    private FilterDto filters;
}
