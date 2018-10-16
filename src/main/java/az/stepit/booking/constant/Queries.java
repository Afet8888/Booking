package az.stepit.booking.constant;

public class Queries {
    public static final String filterQuery =
            "select \n" +
                    "jsonb_agg(distinct jsonb_build_object('id',c.id,'name',c.name,'label',c.\"label\")::text) \"city\",\n" +
                    "jsonb_agg(distinct jsonb_build_object('id',t.id,'name',t.name,'label',t.\"description\")::text) \"type\" ,\n" +
                    "jsonb_agg(distinct jsonb_build_object('id',s.id,'name',s.name,'label',s.\"label\")::text) \"star\" ,\n" +
                    "jsonb_agg(distinct jsonb_build_object('id',cap.id,'name',cap.name,'label',cap.\"capacity\")::text) \"capacity\" ,\n" +
                    "jsonb_agg(distinct jsonb_build_object('id',h.id,'name',h.name,'label',h.\"name\")::text) \"hotel\" \n" +
                    "from advertisement ad\n" +
                    "inner join rooms r on r.hotel_id = ad.hotel_id\n" +
                    "inner join capacity cap on cap.id = r.capaity_id\n" +
                    "inner join \"type\" t on t.id = r.type_id\n" +
                    "inner join hotels h on h.id = ad.hotel_id\n" +
                    "inner join stars s on s.id = h.star_id\n" +
                    "inner join cities c on c.id = h.city_id ";
}
