package com.epam.aop.instrument;

//@Component
public class Violin implements Instrument {
    @Override
    public void play() {
        System.out.println("Viuuu Viuuu Viuuu Viuuu...");
    }
}
