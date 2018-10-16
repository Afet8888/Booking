package az.stepit.booking;

import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.mapper.AdvertisementMapper;
import az.stepit.booking.model.FilterItem;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class Runnable {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
//        String s = "[\"id:3, name:gence, label:Gəncə\",\"id:4, name:quba, label:Quba\"]";
//        String s = "{{id:3, name:gence, label:Gəncə},{id:4, name:quba, label:Quba}}";
        String s = "[\"{\\\"id\\\": 3, \\\"name\\\": \\\"gence\\\", \\\"label\\\": \\\"Gəncə\\\"}\", \"{\\\"id\\\": 4, \\\"name\\\": \\\"quba\\\", \\\"label\\\": \\\"Quba\\\"}\"]";
//        System.out.println(s.replaceAll("[]\\[]",""));
//        for (String s1: s.replaceAll("[]\\[]","").split(",")){
//            System.out.println(s1);
//        }
        List<String> list = mapper.readValue(s,new TypeReference<List<String>>(){});
        FilterItem filterItem = mapper.readValue(list.get(0),FilterItem.class);
        System.out.println(s);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(filterItem));

    }
}
