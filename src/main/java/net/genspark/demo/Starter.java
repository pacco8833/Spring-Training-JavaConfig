package net.genspark.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Starter {
    public static void main(String[] args) {

        AbstractApplicationContext appCTX = new AnnotationConfigApplicationContext(Config.class);
        Employee guy = (Employee) appCTX.getBean("student",Employee.class);
        System.out.println(guy);
        appCTX.close();
    }
}
