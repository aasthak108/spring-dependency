package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDependency {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("org.example");
        applicationContext.refresh();
        Client Client1 = (Client) applicationContext.getBean("Client1");
        Client1.doSomething();
        Service service2 = (Service) applicationContext.getBean("service2");
        System.out.println(service2.getInfo());
    }
}
