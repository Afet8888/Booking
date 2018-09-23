package az.stepit.booking.registry;

import az.stepit.booking.annatation.ServiceMethod;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static az.stepit.booking.logger.Log.info;

@Component
public class MethodRegistry {
    private static Map<String,Map<String,Method>> registry;
    public static Map<String,Map<String,Method>> getRegistry() {
        return registry;
    }

    public static void setRegistry(Map<String,Map<String,Method>> registry) {
        MethodRegistry.registry = registry;
    }

    @PostConstruct
    void init() {
        setRegistry(new HashMap<>());
        update();
    }

    private static void update() {
        info("INITIALIZIN METHOD REGISTRY");

        Reflections reflections = new Reflections("", new TypeAnnotationsScanner(), new SubTypesScanner());
        Reflections reflections1;
        Service service;
        ServiceMethod serviceMethod;
        for (Class clazz : reflections.getTypesAnnotatedWith(Service.class)) {
            service = (Service) clazz.getAnnotation(Service.class);
            reflections1 = new Reflections(clazz.getName(), new MethodAnnotationsScanner());
            Map<String,Method> methodMap = null;
            String methodName;
            info("SERVICE NAME : " + service.value());
            for (Method method : reflections1.getMethodsAnnotatedWith(ServiceMethod.class)) {
                methodName = getMethodName(method);
                info("METHOD NAME : " + methodName);
                if ((methodMap = getRegistry().get(service.value())) == null) {
                    methodMap = new HashMap<>();
                    methodMap.put(methodName, method);
                    getRegistry().put(service.value(), methodMap);
                } else  {
                    methodMap.put(methodName,method);
                }
            }
            getRegistry().replace(service.value(), methodMap);
        }
    }
    private static String getMethodName(Method m) {
        ServiceMethod serviceMethod = m.getAnnotation(ServiceMethod.class);
        return serviceMethod.name().isEmpty() ? m.getName() : serviceMethod.name();
    }
}
