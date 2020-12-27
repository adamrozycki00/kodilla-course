package pl.adaroz.kodillapatterns2.aop.calculator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class Watcher {

    private final static Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* pl.adaroz.kodillapatterns2.aop.calculator.Calculator.factorial(..))" +
            "&& target(target) && args(argument))")
    public void logEvent1(Object target, BigDecimal argument) {
        LOGGER.info("Class: " + target.getClass().getName() + ", Args: " + argument);
    }

    @Around("execution(* pl.adaroz.kodillapatterns2.aop.calculator.Calculator.factorial(..)))")
    public Object measureTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + " ms");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}