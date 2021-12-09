package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentBeans() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock secondBean = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock thirdBean = context.getBean(Clock.class);

        System.out.println(firstBean.getCurrentTime());
        System.out.println(secondBean.getCurrentTime());
        System.out.println(thirdBean.getCurrentTime());

        assertNotEquals(firstBean.getCurrentTime(), secondBean.getCurrentTime());
        assertNotEquals(firstBean.getCurrentTime(), thirdBean.getCurrentTime());
        assertNotEquals(secondBean.getCurrentTime(), thirdBean.getCurrentTime());
    }
}