package calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class CalculatorTestSuite {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testCalculationsAdd() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double a = 4.2;
        double b = 1.9;
        String res = a + b + "\r\n";
        calculator.add(a, b);

        //then
        assertEquals(res, log.getLog());
    }

    @Test
    public void testCalculationsSub() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double a = 4;
        double b = 1.9;
        String res = a - b + "\r\n";
        calculator.sub(a, b);

        //then
        assertEquals(res, log.getLog());
    }

    @Test
    public void testCalculationsMul() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double a = 4.1;
        double b = 5;
        String res = a * b + "\r\n";
        calculator.mul(a, b);

        //then
        assertEquals(res, log.getLog());
    }

    @Test
    public void testCalculationsDIv() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double a = 4.2;
        double b = 2;
        String res = a / b + "\r\n";
        calculator.div(a, b);

        //then
        assertEquals(res, log.getLog());
    }

}
