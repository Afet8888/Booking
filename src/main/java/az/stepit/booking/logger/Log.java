package az.stepit.booking.logger;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    private static Logger logger = LogManager.getLogger();
    public static void info(String msg) {
        logger.info(msg);
    }
}
