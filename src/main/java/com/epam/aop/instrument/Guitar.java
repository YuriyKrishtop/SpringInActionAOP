package com.epam.aop.instrument;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Bryn Bryn Bryn Bryn Bryn...");
    }
}
