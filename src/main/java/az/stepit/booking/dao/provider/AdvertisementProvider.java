package az.stepit.booking.dao.provider;

import az.stepit.booking.dao.dto.IdDTO;
import az.stepit.booking.dao.dto.SearchDTO;

import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

public class AdvertisementProvider {
    public String getAllAdvertisementByFilterQuery(SearchDTO searchDTO){
        return "select ad.* from advertisement ad\n" +
                "inner join rooms r on r.hotel_id = ad.hotel_id\n" +
                "inner join capacity cap on cap.id = r.capacity_id\n" +
                "inner join \"type\" t on t.id = r.type_id\n" +
                "inner join hotels h on h.id = ad.hotel_id\n" +
                "inner join stars s on s.id = h.star_id\n" +
                "inner join cities c on c.id = h.city_id" +
                " left join reservation res on res.room_id = r.id "+
                " where ad.is_active=1 and r.is_active=1 and cap.is_active=1 and t.is_active=1 and h.is_active=1 and s.is_active=1 and c.is_active=1 "
                + buildCondition(searchDTO);
    }

    public String getFiltersQuery(SearchDTO searchDTO){
        searchDTO.setLimit(null);
        searchDTO.setPage(null);
        return "select  count(ad.*) \"count\"," +
                "jsonb_agg(distinct jsonb_build_object('id',c.id,'name',c.name,'label',c.\"label\")::text) \"city\",\n" +
                "jsonb_agg(distinct jsonb_build_object('id',t.id,'name',t.name,'label',t.\"description\")::text) \"type\" ,\n" +
                "jsonb_agg(distinct jsonb_build_object('id',s.id,'name',s.name,'label',s.\"label\")::text) \"star\" ,\n" +
                "jsonb_agg(distinct jsonb_build_object('id',cap.id,'name',cap.name,'label',cap.\"capacity\")::text) \"capacity\" ,\n" +
                "jsonb_agg(distinct jsonb_build_object('id',h.id,'name',h.name,'label',h.\"name\")::text) \"hotel\" " +
                "from advertisement ad\n" +
                "inner join rooms r on r.hotel_id = ad.hotel_id\n" +
                "inner join capacity cap on cap.id = r.capacity_id\n" +
                "inner join \"type\" t on t.id = r.type_id\n" +
                "inner join hotels h on h.id = ad.hotel_id\n" +
                "inner join stars s on s.id = h.star_id\n" +
                "inner join cities c on c.id = h.city_id" +
                " left join reservation res on res.room_id = r.id "+
                " where ad.is_active=1 and r.is_active=1 and cap.is_active=1 and t.is_active=1 and h.is_active=1 and s.is_active=1 and c.is_active=1 "
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
        if (searchDTO.getDateFrom()!=null) {
            s.append(" and r.available_date_from <= #{dateFrom} ");
            s.append(" and (res.end_date < #{dateFrom} ");
            s.append(" or res.start_date > #{dateFrom}) ");
        }
        if (searchDTO.getDateTo()!=null) {
            s.append(" and (res.end_date < #{dateTo} ");
            s.append(" or res.start_date > #{dateTo}) ");
            s.append(" and r.available_date_to >= #{dateTo} ");
        }
        if (Objects.nonNull(searchDTO.getLimit()))s.append(" limit "+searchDTO.getLimit());
        if (Objects.nonNull(searchDTO.getPage()))s.append(" offset "+(searchDTO.getLimit()*(searchDTO.getPage()-1)));
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
