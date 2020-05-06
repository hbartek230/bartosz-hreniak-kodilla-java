package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        // given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator cal = context.getBean(Calculator.class);
        double a = 6;
        double b = 2;
        double addResult = 8;
        double subResult = 4;
        double mulResult = 12;
        double divResult = 3;

        // when
        double addTested = cal.add(a, b);
        double subTested = cal.sub(a, b);
        double mulTested = cal.mul(a, b);
        double divTested = cal.div(a, b);

        // then
        Assert.assertEquals(addResult, addTested, 0.01);
        Assert.assertEquals(subResult, subTested, 0.01);
        Assert.assertEquals(mulResult, mulTested, 0.01);
        Assert.assertEquals(divResult, divTested, 0.01);
    }
}
