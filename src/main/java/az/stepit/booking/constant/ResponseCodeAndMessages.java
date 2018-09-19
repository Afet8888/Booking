package az.stepit.booking.constant;

public enum ResponseCodeAndMessages {
    SUCCESS(0,"SUCCESS"),
    FAIL(500,"FAIL")
    ;
    ResponseCodeAndMessages(Integer code,String message){
        this.code = code;
        this.message = message;
    }
    public final Integer code;
    public final String message;
}
