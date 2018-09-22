package az.stepit.booking.controller;


import az.stepit.booking.registry.MethodRegistry;
import az.stepit.booking.service.AbstractService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    public <T, E> E handle(@RequestBody T t,
                           @PathVariable("serviceName") String serviceName,
                           @PathVariable("methodName") String methodName) {
        Object o = null;
        return MethodRegistry.getRegistry().get(serviceName).get(methodName).invoke(
                factory.get(serviceName, AbstractService.class), o
        );
    }
}
