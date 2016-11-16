package com.epam.aop;

import com.epam.aop.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
        Performer guitarist =  applicationContext.getBean("guitarist", Performer.class);
        guitarist.perform();
    }
}
