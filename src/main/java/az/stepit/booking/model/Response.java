package az.stepit.booking.model;

import az.stepit.booking.constant.ResponseCodeAndMessages;
import lombok.Data;

@Data
public class Response {
    private Integer code;
    private String message;

    public Response(){}

    public Response(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Response(ResponseCodeAndMessages r){
        this.code = r.code;
        this.message = r.message;
    }
}
