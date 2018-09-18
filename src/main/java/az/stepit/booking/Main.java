package az.stepit.booking;

import az.stepit.booking.dao.dto.SearchDTO;

public class Main {
    public static void main(String[] args) {
        SearchDTO searchDTO = new SearchDTO();
        searchDTO.getCity().getId();
        searchDTO.getStar().getId();
        searchDTO.getCapacity().getId();
        searchDTO.getType().getId();

    }
}
