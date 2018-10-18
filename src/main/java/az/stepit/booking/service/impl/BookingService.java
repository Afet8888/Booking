package az.stepit.booking.service.impl;

import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.model.AdvertisementResponse;
import az.stepit.booking.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    AdvertisementServiceImpl advertisementService;
    @Autowired
    FilterService filterService;

    public AdvertisementResponse getAdvertisementAndFilter(SearchDTO searchDTO){
        AdvertisementResponse response =  new AdvertisementResponse();
        response.setAdvertisements(advertisementService.findAll(searchDTO));
        response.setFilters(filterService.findAll(searchDTO).get(0));
        response.setResponse(Utility.getSuccessfulResponse());
        return response;
    }
}
