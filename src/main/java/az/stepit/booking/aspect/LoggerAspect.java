package az.stepit.booking.aspect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    ObjectMapper mapper = new ObjectMapper();

    @Around("execution(*az.stepit.booking.controller.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint)  throws Throwable{
        String methodName = buildMethodName(joinPoint);
        String requestData = buildRequestData(joinPoint);
        info(methodName.concat(" ").concat(requestData));

        Object returnValue = joinPoint.proceed();
        info(methodName
                .concat(" ")
        .concat(mapper
        .writeValueAsString(returnValue)));
        return returnValue;
    }

    private String buildMethodName(JoinPoint joinPoint) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(joinPoint.getTarget(),getClass().getSimpleName());
        buffer.append(".");
        buffer.append(joinPoint.getSignature().getName()+ " ");
        return buffer.toString();

    }

    private String buildRequestData(JoinPoint joinPoint) throws JsonProcessingException;
    StringBuffer buffer = new StringBuffer();
    Object[] args = joinPoint.getArgs() {

    }
}
