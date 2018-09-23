package az.stepit.booking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import az.stepit.booking.registry.AbstractFactory;
import az.stepit.booking.registry.MethodRegistry;
import az.stepit.booking.service.AbstractService;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

@RestController
public class MainController {

    @Autowired
    AbstractFactory factory;

    @PostMapping("/{serviceName}/{methodName}")
    public <T, E> E handlePost(@RequestBody T t,
                               @PathVariable("serviceName") String serviceName,
                               @PathVariable("methodName") String methodName) throws InvocationTargetException, IllegalAccessException {
        return MethodRegistry.getRegistry().get(serviceName).get(methodName).invoke(
                factory.get(serviceName, AbstractService.class), t
        );
    }

    @GetMapping("/{serviceName}/{methodName}")
    public <E> E handleGet(@RequestParam HashMap<String, String> t,
                           @PathVariable("serviceName") String serviceName,
                           @PathVariable("methodName") String methodName) throws InvocationTargetException, IllegalAccessException {
        return t.isEmpty() ? (E) MethodRegistry.getRegistry().get(serviceName).get(methodName).invoke(
                factory.get(serviceName, AbstractService.class), null
        ) :
                (E) MethodRegistry.getRegistry().get(serviceName).get(methodName).invoke(
                        factory.get(serviceName, AbstractService.class), t
                );
    }
}
