package az.stepit.booking.utility;

import az.stepit.booking.constant.ResponseCodeAndMessages;
import az.stepit.booking.model.FilterItem;
import az.stepit.booking.model.Response;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.dynalink.beans.StaticClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static az.stepit.booking.constant.ResponseCodeAndMessages.FAIL;
import static az.stepit.booking.constant.ResponseCodeAndMessages.SUCCESS;

public class Utility {
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    public static <T> T convert(String input,Class<T> clazz) throws IOException {
        return mapper.readValue(input,clazz);
    }

    public static <T> T convert(String input,TypeReference<T> reference) throws IOException {
        return mapper.readValue(input,reference);
    }

    public static List<FilterItem> buildFilterItemList(String res) {
        List<FilterItem> list = new ArrayList<>();
        if (Objects.nonNull(res)) {
            try {
                List<String> list1 = mapper.readValue(res, new TypeReference<List<String>>() {
                });
                list1.forEach(item -> {
                    try {
                        list.add(mapper.readValue(item, FilterItem.class));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                System.out.println(res);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return list;
    }

    public static Response getSuccessfulResponse(){
        return new Response(SUCCESS);
    }

    public static Response getInternalErrorResponse(){
        return new Response(FAIL);
    }
}
