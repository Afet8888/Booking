//package az.stepit.booking;
//
//import az.stepit.booking.dao.dto.Hotel;
//import az.stepit.booking.registry.AbstractFactory;
//import az.stepit.booking.registry.MethodRegistry;
//import az.stepit.booking.service.AbstractService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.lang.reflect.InvocationTargetException;
//
//@RestController
//@RequestMapping("/public")
//public class CommonController {
//
//    @Autowired
//    AbstractFactory factory;
//
//    @PostMapping("/{service}/{method}")
//    public Object handle(@PathVariable("service") String service, @PathVariable("method") String method, @RequestBody Object o) throws InvocationTargetException, IllegalAccessException {
//        System.out.println("INCOMING REQUEST");
//        System.out.println(service);
//        System.out.println(method);
//        return MethodRegistry
//                .getRegistry()
//                .get(service)
//                .get(method)
//                .invoke(factory
//                        .get(service
//                                ,AbstractService.class)
//                        ,o);
//    }
//}
