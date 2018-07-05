package com.iristeam.rd.application;

import com.iristeam.rd.beans.Greet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPoc {

    public static void main(String[] args) {

        // read XML file
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // create Greet object
        Greet gt = (Greet) context.getBean("sayHello");
        gt.welcome();

    }
}
