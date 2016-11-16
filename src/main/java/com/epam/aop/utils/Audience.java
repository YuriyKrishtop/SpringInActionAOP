package com.epam.aop.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

    @Pointcut("execution(* com.epam.aop.performers.Performer.perform(..))")
    public void performance(){
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    @After("performance()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        System.out.println("*******************************");
        long start = System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long finish = System.currentTimeMillis();
        System.out.println("******************************");
        System.out.println("Duration: " + (finish - start) + " msec" );
    }

    @Pointcut("execution(* com.epam.aop.performers.Performer.say(String))&& args(word)")
    public void saying(String word){
    }

    @Before("saying(word)")
    public void interceptWord(String word) {
        System.out.println("Performer will say: " + word);
    }

}
