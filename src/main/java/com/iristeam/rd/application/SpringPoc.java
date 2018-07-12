package com.iristeam.rd.application;

import com.iristeam.rd.repositories.UserRepository;
import com.iristeam.rd.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPoc {


    public static void main(String[] args) {

        // read XML file
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        UserService userService = context.getBean(UserService.class);

       /* String path = SpringPoc.class.getClassLoader()
                .getResource("logging.properties")
                .getFile();
        System.setProperty("java.util.logging.config.file", path);*/

        UserRepository userRepo = context.getBean(UserRepository.class);
        // create Greet object
        userService.getUserRepository().welcome();
    }
}
