package com.epam.aop.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Component
@Aspect
public class Audience {
//
//    @Pointcut("execution(* com.epam.aop.performers.Performer.perform(..))")
//    public void performance(){
//    }

//    @Before("performance()")
@Before("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
//    @Before("execution(* com.epam.aop.performers.Performer.perform(..))")
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
}
