package az.stepit.booking.registry;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MethodRegistry {
    private static Map<String,Map<String,Method>> registry;
    static {
        registry = new HashMap<>();
        update();
    }
    private static void update() {
        Reflections reflections = new Reflections("", new TypeAnnotationsScanner(), new SubTypesScanner());
    }
}
