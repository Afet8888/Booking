package az.stepit.booking.dao.provider;

import az.stepit.booking.dao.dto.IdDTO;
import az.stepit.booking.dao.dto.SearchDTO;

public class AdvertisementProvider {
    public String getAllAdvertisementByFilterQuery(SearchDTO searchDTO){
        return "select ad.* from advertisement ad\n" +
                "inner join rooms r on r.hotel_id = ad.hotel_id\n" +
                "inner join capacity cap on cap.id = r.capaity_id\n" +
                "inner join \"type\" t on t.id = r.type_id\n" +
                "inner join hotels h on h.id = ad.hotel_id\n" +
                "inner join stars s on s.id = h.star_id\n" +
                "inner join cities c on c.id = h.city_id where is_active=1 "
                + buildCondition(searchDTO);
    }

    private String buildCondition(SearchDTO searchDTO){
        StringBuilder s = new StringBuilder();
        IdDTO dto;
        if ((dto=searchDTO.getCapacity())!=null && dto.getId()!=null) s.append(" and cap.id = #{capacity.id} ");
        if ((dto=searchDTO.getCity())!=null && dto.getId()!=null) s.append(" and c.id = #{city.id} ");
        if ((dto=searchDTO.getHotel())!=null && dto.getId()!=null) s.append(" and ad.hotel_id = #{hotel.id} ");
        if ((dto=searchDTO.getStar())!=null && dto.getId()!=null) s.append(" and s.id = #{star.id} ");
        if ((dto=searchDTO.getType())!=null && dto.getId()!=null) s.append(" and t.id = #{type.id} ");
        if (searchDTO.getPriceFrom()!=null) s.append(" and r.price >= #{priceFrom} ");
        if (searchDTO.getPriceTo()!=null) s.append(" and r.price <= #{priceTo} ");
        if (searchDTO.getDateFrom()!=null) s.append(" and r.available_date_from >= #{dateFrom} ");
        if (searchDTO.getDateTo()!=null) s.append(" and r.available_date_to <= #{dateTo} ");
        return s.toString();
    }
}
