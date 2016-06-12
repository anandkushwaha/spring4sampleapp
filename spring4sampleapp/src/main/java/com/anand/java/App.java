package com.anand.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anand.bean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.getName();

    }
}
