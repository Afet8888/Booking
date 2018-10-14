package az.stepit.booking.utility;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

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
}
