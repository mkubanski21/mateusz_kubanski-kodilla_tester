package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void packageShouldBeDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("London, Green Street 62/21", 30);
        assertEquals("Package delivered to: London, Green Street 62/21", result);

    }

    @Test
    public void packageShouldNotBeDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("London, Green Street 62/21", 30.1);
        assertEquals("Package not delivered to: London, Green Street 62/21", result);

    }
}