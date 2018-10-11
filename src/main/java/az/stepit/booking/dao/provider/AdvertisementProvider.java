package az.stepit.booking.dao.provider;

import az.stepit.booking.dao.dto.IdDTO;
import az.stepit.booking.dao.dto.SearchDTO;

import javax.persistence.Id;
import java.util.List;

public class AdvertisementProvider {
    public String getAllAdvertisementByFilterQuery(SearchDTO searchDTO){
        return "select ad.* from advertisement ad\n" +
                "inner join rooms r on r.hotel_id = ad.hotel_id\n" +
                "inner join capacity cap on cap.id = r.capaity_id\n" +
                "inner join \"type\" t on t.id = r.type_id\n" +
                "inner join hotels h on h.id = ad.hotel_id\n" +
                "inner join stars s on s.id = h.star_id\n" +
                "inner join cities c on c.id = h.city_id where ad.is_active=1 and r.is_active=1 and cap.is_active=1 and t.is_active=1 and h.is_active=1 and s.is_active=1 and c.is_active=1 "
                + buildCondition(searchDTO);
    }

    private String buildCondition(SearchDTO searchDTO){
        StringBuilder s = new StringBuilder();
        IdDTO dto;
        List<IdDTO> dtoList;
        String temp;
        if ((temp=conditionFromList(searchDTO.getCapacities(),"cap.id"))!=null) s.append(temp);
        if ((temp=conditionFromList(searchDTO.getCities(),"c.id"))!=null) s.append(temp);
        if ((dto=searchDTO.getHotel())!=null && dto.getId()!=null) s.append(" and ad.hotel_id = #{hotel.id} ");
        if ((temp=conditionFromList(searchDTO.getStars(),"s.id"))!=null) s.append(temp);
        if ((temp=conditionFromList(searchDTO.getTypes(),"t.id"))!=null) s.append(temp);
        if (searchDTO.getPriceFrom()!=null) s.append(" and r.price >= #{priceFrom} ");
        if (searchDTO.getPriceTo()!=null) s.append(" and r.price <= #{priceTo} ");
        if (searchDTO.getDateFrom()!=null) s.append(" and r.available_date_from >= #{dateFrom} ");
        if (searchDTO.getDateTo()!=null) s.append(" and r.available_date_to <= #{dateTo} ");
        return s.toString();
    }

    private String conditionFromList(List<IdDTO> idDTOS,String col){
        StringBuilder or;
        if (idDTOS!=null && !idDTOS.isEmpty()) {
                or = new StringBuilder();
                or.append(" "+col+" in(-1");
                StringBuilder finalOr = or;
                idDTOS.forEach((idDTO -> {
                    if (idDTO.getId() != null)
                        finalOr.append(", "+idDTO.getId());

                }));
                or.append(") ");
                return " and ".concat(or.toString());
        }
        return null;
    }
}
