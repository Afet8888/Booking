package az.stepit.booking.constant;

/**
 * Created by Sherif on 6/1/2018.
 */

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users/signUp";
    public static final String TEST = "/advertisement/getAllAdvertisements";
}
